package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.SysSet;
import com.hy.hyTravel.entity.SysSetKey;
import com.hy.hyTravel.service.SysSetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 系统设置管理
 */
@RestController
@RequestMapping(value = "/sysSet")
public class SysSetController {
    private Logger loger = LoggerFactory.getLogger(SysSetController.class);

    @Autowired
    public SysSetService sysSetService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<SysSet> getAll(){
        List<SysSet> list  =  new ArrayList<>();
        list = sysSetService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}/{code}",method = RequestMethod.GET)
    public SysSet selectSysSetById(@PathVariable("id")String id, @PathVariable("code")String code){
        SysSetKey sysSetKey = new SysSetKey();
        sysSetKey.setFunctionCode(code);
        sysSetKey.setFunctionId(id);
        return this.sysSetService.selectSysSetById(sysSetKey);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateSysSetById(@PathVariable("id")String id, @RequestBody SysSet sysSet){
        int i = this.sysSetService.updateSysSetById(sysSet);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertSysSet(@RequestBody SysSet sysSet){
        int i = this.sysSetService.insertSysSet(sysSet);
        if (i>0)
            return new ResultMessage(1,"添加成功",null);
        return new ResultMessage(0,"添加失败",null);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}/{code}",method = RequestMethod.DELETE)
    public ResultMessage deleteSysSetById(@PathVariable("id")String id, @PathVariable("code")String code){
        SysSetKey sysSetKey = new SysSetKey();
        sysSetKey.setFunctionId(id);
        sysSetKey.setFunctionCode(code);
        int i = this.sysSetService.deleteSysSetById(sysSetKey);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }
}
