package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.Hotel;
import com.hy.hyTravel.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 酒店管理
 */
@RestController
@RequestMapping(value = "/public/hotel")
public class HotelController {
    private static final Logger loger = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    public HotelService hotelService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<Hotel> getAll(){
        List<Hotel> list  =  new ArrayList<>();
        list = hotelService.getAll();
        loger.info("优惠券全量查询，总数："+list.size());
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public Hotel selectHotelById(@PathVariable("id")String id){
        return this.hotelService.selectHotelById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateHotelById(@PathVariable("id")String id, @RequestBody Hotel hotel){
        int i = this.hotelService.updateHotelById(id,hotel);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertHotel(@RequestBody Hotel hotel){
        int i = this.hotelService.insertHotel(hotel);
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
    public ResultMessage deleteHotelById(@PathVariable("id")String id){
        int i = this.hotelService.deleteHotelById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }
}
