package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.SysUsers;
import com.hy.hyTravel.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private Logger loger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<SysUsers> getAll(){
        List<SysUsers> list  =  new ArrayList<>();
        list = userService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public SysUsers selectUserById(@PathVariable("id")String id){
        return this.userService.selectUserById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateUserById(@PathVariable("id")String id, @RequestBody SysUsers user){
        int i = this.userService.updateUserById(id,user);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertUser(@RequestBody SysUsers user){
        int i = this.userService.insertUser(user);
        if (i>0)
            return new ResultMessage(1,"添加成功",null);
        return new ResultMessage(0,"添加失败",null);
    }

}
