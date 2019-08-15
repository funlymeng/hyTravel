package com.hy.hyTravel.common.shiro;

import com.hy.hyTravel.entity.SysUserRole;
import com.hy.hyTravel.entity.SysUsers;
import com.hy.hyTravel.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * 认证授权
 *
 */
public class CustomRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    /**
     *
     * 为当前subject授权
     * @param principalCollection
     * @return AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Map<String, Object> params = new HashMap<>();
        params.put("username", (String) super.getAvailablePrincipal(principalCollection));
        List<SysUserRole> userRoleInfos = userService.selectUserRole(params);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if(!userRoleInfos.isEmpty()) {
            for(SysUserRole role : userRoleInfos) {
                info.addRole(role.getRoleId());
            }
        }
        return info;
    }

    /**
     *
     * <p>
     * 获取即将需要认证的信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Map<String, Object> params = new HashMap<>();
        params.put("username", (String)authenticationToken.getPrincipal());
        List<SysUsers> userInfos = userService.selectUsers(params);
        if (userInfos.isEmpty()) {
            throw new UnknownAccountException();
        } else if(userInfos.size() > 1) {
            throw new DisabledAccountException();
        } else {
            SysUsers user = userInfos.get(0);
            // 校验密码
            return new SimpleAuthenticationInfo(authenticationToken.getPrincipal(), user.getUserPwd(), ByteSource.Util.bytes("2w@W"),  getName());
        }
    }
}
