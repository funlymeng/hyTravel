package com.hy.hyTravel.common.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 描述：
 *
 */
@Configuration
public class ShiroConfig {
    private static final Logger loger = LoggerFactory.getLogger(ShiroConfig.class);

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setUnauthorizedUrl("/notRole");
        Map<String, Filter> filter = new LinkedHashMap<>();
        filter.put("auth",new ShiroFilter());
        shiroFilterFactoryBean.setFilters(filter);
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        filterChainDefinitionMap.put("/css/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/fonts/**", "anon");
        filterChainDefinitionMap.put("/imgs/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/auth/**", "anon");
        filterChainDefinitionMap.put("/errorPage/**", "anon");
        filterChainDefinitionMap.put("/demo/**", "anon");
        filterChainDefinitionMap.put("/swagger-*/**", "anon");
        filterChainDefinitionMap.put("/swagger-ui.html/**", "anon");
        filterChainDefinitionMap.put("/webjars/**", "anon");
        filterChainDefinitionMap.put("/public/**", "anon");
        filterChainDefinitionMap.put("/login/**", "anon");
        filterChainDefinitionMap.put("/api/**", "anon");
        filterChainDefinitionMap.put("/admin/**", "roles[admin]");// 表示admin权限才可以访问，多个加引号用逗号相隔
        filterChainDefinitionMap.put("/**", "auth");// 表示需要认证才可以访问
        //主要这行代码必须放在所有权限设置的最后，不然会导致所有 url 都被拦截 剩余的都需要认证
//        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        loger.info("shiroFilter 注册完成。");
        return shiroFilterFactoryBean;

    }

    @Bean(name = "securityManager")
    public SecurityManager securityManager(@Qualifier("customRealm")CustomRealm customRealm) {
        DefaultWebSecurityManager defaultSecurityManager = new DefaultWebSecurityManager();
        defaultSecurityManager.setRealm(customRealm);
        loger.info("securityManager 注册完成。");
        return defaultSecurityManager;
    }

    @Bean(name = "customRealm")
    public CustomRealm customRealm() {
        CustomRealm customRealm = new CustomRealm();
        loger.info("customRealm 注册完成。");
        return customRealm;
    }
}

