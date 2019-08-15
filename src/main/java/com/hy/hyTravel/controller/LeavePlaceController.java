package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.LeavePlace;
import com.hy.hyTravel.service.LeavePlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 散团地管理
 */
@RestController
@RequestMapping(value = "/public/leavePlace")
public class LeavePlaceController {
    private Logger loger = LoggerFactory.getLogger(LeavePlaceController.class);

    @Autowired
    public LeavePlaceService leavePlaceService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<LeavePlace> getAll(){
        List<LeavePlace> list  =  new ArrayList<>();
        list = leavePlaceService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public LeavePlace selectLeavePlaceById(@PathVariable("id")String id){
        return this.leavePlaceService.selectLeavePlaceById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateLeavePlaceById(@PathVariable("id")String id, @RequestBody LeavePlace leavePlace){
        int i = this.leavePlaceService.updateLeavePlaceById(id,leavePlace);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertLeavePlace(@RequestBody LeavePlace leavePlace){
        int i = this.leavePlaceService.insertLeavePlace(leavePlace);
        if (i>0)
            return new ResultMessage(1,"添加成功",null);
        return new ResultMessage(0,"添加失败",null);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.DELETE)
    public ResultMessage deleteLeavePlaceById(@PathVariable("id")String id){
        int i = this.leavePlaceService.deleteLeavePlaceById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }
}
