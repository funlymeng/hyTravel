package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.GatheringPlace;
import com.hy.hyTravel.service.GatheringPlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合地
 */
@RestController
@RequestMapping(value = "/public/gatheringPlace")
public class GatheringPlaceController {
    private static final Logger loger = LoggerFactory.getLogger(GatheringPlaceController.class);

    @Autowired
    public GatheringPlaceService gatheringPlaceService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<GatheringPlace> getAll(){
        List<GatheringPlace> list  =  new ArrayList<>();
        list = gatheringPlaceService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public GatheringPlace selectGatheringPlaceById(@PathVariable("id")String id){
        return this.gatheringPlaceService.selectGatheringPlaceById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateGatheringPlaceById(@PathVariable("id")String id, @RequestBody GatheringPlace gatheringPlace){
        int i = this.gatheringPlaceService.updateGatheringPlaceById(id,gatheringPlace);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertGatheringPlace(@RequestBody GatheringPlace gatheringPlace){
        int i = this.gatheringPlaceService.insertGatheringPlace(gatheringPlace);
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
    public ResultMessage deleteGatheringPlaceById(@PathVariable("id")String id){
        int i = this.gatheringPlaceService.deleteGatheringPlaceById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }
}
