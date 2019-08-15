package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.GroupLeader;
import com.hy.hyTravel.service.GroupLeaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 领队管理
 */
@RestController
@RequestMapping(value = "/public/groupLeader")
public class GroupLeaderController {
    private static final Logger loger = LoggerFactory.getLogger(GroupLeaderController.class);

    @Autowired
    public GroupLeaderService groupLeaderService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<GroupLeader> getAll(){
        List<GroupLeader> list  =  new ArrayList<>();
        list = groupLeaderService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public GroupLeader selectGroupLeaderById(@PathVariable("id")String id){
        return this.groupLeaderService.selectGroupLeaderById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateGroupLeaderById(@PathVariable("id")String id, @RequestBody GroupLeader groupLeader){
        int i = this.groupLeaderService.updateGroupLeaderById(id,groupLeader);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertGroupLeader(@RequestBody GroupLeader groupLeader){
        int i = this.groupLeaderService.insertGroupLeader(groupLeader);
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
    public ResultMessage deleteGroupLeaderById(@PathVariable("id")String id){
        int i = this.groupLeaderService.deleteGroupLeaderById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }
}
