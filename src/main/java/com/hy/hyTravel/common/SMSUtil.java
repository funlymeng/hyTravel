package com.hy.hyTravel.common;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class SMSUtil {

    public SmsSingleSenderResult sendSMS(String phoneNumber,String msg,int appId,String appKey){
        SmsSingleSenderResult result = null;
        try {
            SmsSingleSender ssender = new SmsSingleSender(appId, appKey);
            result = ssender.send(0, "86", phoneNumber,
                    msg, "", "");
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP 响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // JSON 解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络 IO 错误
            e.printStackTrace();
        }
        return result;
    }

}
