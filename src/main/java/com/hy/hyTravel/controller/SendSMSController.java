package com.hy.hyTravel.controller;

import com.github.qcloudsms.SmsSingleSenderResult;
import com.hy.hyTravel.common.MyUUID;
import com.hy.hyTravel.common.RedisUtil;
import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.common.SMSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/public/sendSMS")
public class SendSMSController {
    private static final Logger loger = LoggerFactory.getLogger(SendSMSController.class);

    @Autowired
    private SMSUtil smsUtil;

    @Autowired
    private RedisUtil redisUtil;

    @Value("${sms.AppID}")
    private int appId;

    @Value("${sms.AppKey}")
    private String appKey;

    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public ResultMessage sendSMS(String phoneNumber){
        String smsCode = MyUUID.getNumber4();
        boolean br = false;
        if (redisUtil.hasKey("SMS"+phoneNumber)) {
            redisUtil.del("SMS" + phoneNumber);
        }
        br = redisUtil.set("SMS" + phoneNumber, smsCode, 300);
        if (br) {
            SmsSingleSenderResult result = smsUtil.sendSMS(phoneNumber, "[恒愉旅行]您的验证码是：" + smsCode, appId, appKey);
            if (result.result == 0) {
                return new ResultMessage(1,"验证码发送成功",result);
            } else {
                loger.error("发送短信接口报错: "+result.errMsg,phoneNumber);
                return new ResultMessage(-1044,"验证码发送失败",null);
            }
        }
        loger.error("Redis 保存短信验证码失败 ："+phoneNumber);
        return new ResultMessage(-1045,"验证码发送失败",null);
    }
}
