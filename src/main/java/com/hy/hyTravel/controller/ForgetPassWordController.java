package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.RedisUtil;
import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.SysUsers;
import com.hy.hyTravel.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 找回密码
 */
@RestController
@RequestMapping(value = "/public/forget")
public class ForgetPassWordController {
    private static final Logger loger = LoggerFactory.getLogger(ForgetPassWordController.class);

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserService userService;

    /**
     * 校验短信验证码
     * @param phoneNumber
     * @param smsCode
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public ResultMessage forgetPassWord(String phoneNumber, String smsCode){
        boolean hk = redisUtil.hasKey("SMS"+phoneNumber);
        if(hk){
            String code = (String)redisUtil.get("SMS"+phoneNumber);
            if(code.equals(smsCode)){
                return new ResultMessage(1,"验证码校验成功",null);
            }
        }
        loger.info("phoneNumber:"+phoneNumber+"验证码错误或已过期");
        return new ResultMessage(-10050,"验证码错误或已过期，请重新输入",null);
    }

    /**
     * 修改密码
     * @param phoneNumber
     * @param newPassword
     * @return
     */
    @RequestMapping(value = "/api/{phoneNumber}",method = RequestMethod.PUT)
    public ResultMessage updatePassword(@PathVariable("phoneNumber")String phoneNumber, String newPassword){
        List<SysUsers> list = userService.selectUserByPhoneNumber(phoneNumber);
        SysUsers user = list.get(0);
        user.setUserPwd(newPassword);
        int i = userService.updateUserById(user.getUserId(),user);
        if (i>0){
            loger.info(phoneNumber+"-修改密码成功");
            return new ResultMessage(1,"密码修改成功",null);
        }
        loger.error(phoneNumber+"-修改密码失败");
        return new ResultMessage(-10060,"密码修改失败，请稍后再试",null);
    }

}
