package com.hy.hyTravel.common.shiro;

import com.alibaba.druid.util.StringUtils;
import com.hy.hyTravel.entity.SysUsers;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//@Configuration
public class ShiroFilter extends FormAuthenticationFilter {
    //加密的字符串,相当于签名
//    @Value("shiro.sso.secretKey")
    private static final String SECRET_KEY = "QAZWSX123M";

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        //这里只有返回false才会执行onAccessDenied方法,因为
        // return super.isAccessAllowed(request, response, mappedValue);
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        String token = getRequestToken((HttpServletRequest) request);
        String login = ((HttpServletRequest) request).getServletPath();

        //如果为登录,就放行
        if ("/login".equals(login)){
            return true;
        }
        if (StringUtils.isEmpty(token)){
            System.out.println("没有token");
            return false;
        }

        //从当前shiro中获得用户信息
        String username = (String)SecurityUtils.getSubject().getPrincipal();
        //对当前ID进行SHA256加密
        String encryptionKey= DigestUtils.sha256Hex(SECRET_KEY + username);
        if (encryptionKey.equals(token)){
            return true;
        }else{
            System.out.println("无效token");
        }
        return false;
    }

    private String getRequestToken(HttpServletRequest request){
        //默认从请求头中获得token
        String token = request.getHeader("token");
        //如果header中不存在token，则从参数中获取token
        if(StringUtils.isEmpty(token)){
            token = request.getParameter("token");
        }
        return token;
    }

    public static void main(String[] args) {
        String encryptionKey= DigestUtils.sha256Hex("QAZWSX123M"+1);
        System.out.println(encryptionKey);
        //83a3cdae253441e7a6ba319475208f8ccf1887bb312bb1d4c11e2c8a8a3ff688
    }

}
