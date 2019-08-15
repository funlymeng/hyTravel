package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.TravelCar;
import com.hy.hyTravel.service.TravelCarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 旅行车辆管理
 */
@RestController
@RequestMapping(value = "/public/car")
public class TravelCarController {
    private Logger loger = LoggerFactory.getLogger(TravelCarController.class);

    @Autowired
    public TravelCarService travelCarService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<TravelCar> getAll(){
        List<TravelCar> list  =  new ArrayList<>();
        list = travelCarService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public TravelCar selectTravelCarById(@PathVariable("id")String id){
        return this.travelCarService.selectTravelCarById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateTravelCarByid(@PathVariable("id")String id, @RequestBody TravelCar travelCar){
        int i = this.travelCarService.updateTravelCarByid(id,travelCar);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertTravelCar(@RequestBody TravelCar travelCar){
        int i = this.travelCarService.insertTravelCar(travelCar);
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
    public ResultMessage deleteTravelCarById(@PathVariable("id")String id){
        int i = this.travelCarService.deleteTravelCarById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }
}
