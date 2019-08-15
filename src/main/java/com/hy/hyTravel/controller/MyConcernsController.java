package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.DiscountCoupon;
import com.hy.hyTravel.entity.extend.ConcernsVO;
import com.hy.hyTravel.service.DiscountCouponService;
import com.hy.hyTravel.service.MyConcernsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的关注
 */
@RestController
@RequestMapping(value = "/public/myConcerns")
public class MyConcernsController {
    private static final Logger loger = LoggerFactory.getLogger(MyConcernsController.class);

    @Autowired
    public MyConcernsService myConcernsService;

    /**
     * 查询所有关注
     * @return
     */
    @RequestMapping(value = "/api/{userId}/{concernsType}",method = RequestMethod.GET)
    public List<ConcernsVO> getAll(@PathVariable("userId")String userId,@PathVariable("concernsType")String concernsType){
        ConcernsVO concernsVO = new ConcernsVO();
        concernsVO.setUserId(userId);
        concernsVO.setConcernsType(concernsType);
        List<ConcernsVO> list  =  new ArrayList<>();
        list = myConcernsService.getAll(concernsVO);
        return list;
    }
//
//    /**
//     * 根据id查询
//     * @param id
//     * @return
//     */
//    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
//    public DiscountCoupon selectCouponById(@PathVariable("id")String id){
//        return this.myConcernsService.selectCouponById(id);
//    }
//
//
//    /**
//     * 新增
//     * @return
//     */
//    @RequestMapping(value = "/api",method = RequestMethod.POST)
//    public ResultMessage insertCoupon(@RequestBody DiscountCoupon coupon){
//        int i = this.myConcernsService.insertCoupon(coupon);
//        if (i>0)
//            return new ResultMessage(1,"添加成功",null);
//        return new ResultMessage(0,"添加失败",null);
//    }
//
//    /**
//     * 删除
//     * @param id
//     * @return
//     */
//    @RequestMapping(value = "/api/{id}",method = RequestMethod.DELETE)
//    public ResultMessage deleteCouponById(@PathVariable("id")String id){
//        int i = this.myConcernsService.deleteCouponById(id);
//        if (i>0)
//            return new ResultMessage(1,"删除成功",null);
//        return new ResultMessage(0,"删除失败",null);
//    }

}
