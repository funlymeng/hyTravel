package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.DiscountCoupon;
import com.hy.hyTravel.service.DiscountCouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 优惠券
 */
@RestController
@RequestMapping(value = "/public/discountCoupon")
public class DiscountCouponController {
    private static final Logger loger = LoggerFactory.getLogger(DiscountCouponController.class);

    @Autowired
    public DiscountCouponService discountCouponService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<DiscountCoupon> getAll(){
        List<DiscountCoupon> list  =  new ArrayList<>();
        list = discountCouponService.getAll();
        loger.info("优惠券全量查询，总数："+list.size());
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public DiscountCoupon selectCouponById(@PathVariable("id")String id){
        return this.discountCouponService.selectCouponById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateCouponById(@PathVariable("id")String id,@RequestBody DiscountCoupon coupon){
        int i = this.discountCouponService.updateCouponById(id,coupon);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertCoupon(@RequestBody DiscountCoupon coupon){
        int i = this.discountCouponService.insertCoupon(coupon);
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
    public ResultMessage deleteCouponById(@PathVariable("id")String id){
        int i = this.discountCouponService.deleteCouponById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }

}
