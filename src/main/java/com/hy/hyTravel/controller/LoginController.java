package com.hy.hyTravel.controller;

import com.github.qcloudsms.SmsSingleSenderResult;
import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.common.SMSUtil;
import com.hy.hyTravel.entity.SysUsers;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Value("${sms.AppID}")
    private int appId;

    @Value("${sms.AppKey}")
    private String appKey;

    private static final Logger loger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }

    @ResponseBody
    @RequestMapping(value = "/loginIn", produces = "application/json;charset=UTF-8")
    public ResultMessage loginIn(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // shiro认证
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(username);
        token.setPassword(password.toCharArray());
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            return new ResultMessage(-1001,"账户不存在",null);
        } catch (DisabledAccountException e) {
            return new ResultMessage(-1002,"账户存在问题",null);
        } catch (AuthenticationException e) {
            return new ResultMessage(-1003,"密码错误",null);
        } catch (Exception e) {
            loger.info("登陆异常", e);
            return new ResultMessage(-1000,"登陆异常",null);
        }
        String res = subject.getPrincipals().toString();

        return new ResultMessage(1,"登录成功",res);
    }

    public static void main(String[] args) {
        SMSUtil smsUtil = new SMSUtil();
        SmsSingleSenderResult result = smsUtil.sendSMS("13817470004","【恒愉旅行】您的验证码是： ",1400238214,"3c8496301e0e6274f383f8ded36a4d29");
        System.out.println(result.errMsg);
    }
}
