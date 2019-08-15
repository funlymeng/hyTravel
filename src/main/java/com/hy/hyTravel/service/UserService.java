package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.SysUserRole;
import com.hy.hyTravel.entity.SysUsers;
import com.hy.hyTravel.mapper.SysUserRoleExample;
import com.hy.hyTravel.mapper.SysUserRoleMapper;
import com.hy.hyTravel.mapper.SysUsersExample;
import com.hy.hyTravel.mapper.SysUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 用户管理
 */
@Service
public class UserService {

    @Autowired
    private SysUsersMapper sysUsersMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    public List<SysUsers> getAll(){
        SysUsersExample sysUsersExample = new SysUsersExample();
        return sysUsersMapper.selectByExample(sysUsersExample);
    }

    public SysUsers selectUserById(String id){
        return sysUsersMapper.selectByPrimaryKey(id);
    }

    public int insertUser(SysUsers user){
        return sysUsersMapper.insert(user);
    }

    public int updateUserById(String id, SysUsers user){
        return sysUsersMapper.updateByPrimaryKey(user);
    }

    /**
     * 查询用户角色
     * @param params
     * @return
     */
    public List<SysUserRole> selectUserRole(Map<String, Object> params){
        if (params.isEmpty())
            return null;
        String userId = params.get("userId").toString();
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        return sysUserRoleMapper.selectByExample(sysUserRoleExample);
    }
    /**
     * 查询用户
     * @param params
     * @return
     */
    public List<SysUsers> selectUsers(Map<String, Object> params){
        if (params.isEmpty())
            return null;
        String userId = params.get("username").toString();
        SysUsersExample sysUsersExample = new SysUsersExample();
        sysUsersExample.createCriteria().andUserIdEqualTo(userId);
        return sysUsersMapper.selectByExample(sysUsersExample);
    }

    /**
     * 查询用户
     * @param phoneNumber
     * @return
     */
    public List<SysUsers> selectUserByPhoneNumber(String phoneNumber){
        SysUsersExample sysUsersExample = new SysUsersExample();
        sysUsersExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
        return sysUsersMapper.selectByExample(sysUsersExample);
    }

}
