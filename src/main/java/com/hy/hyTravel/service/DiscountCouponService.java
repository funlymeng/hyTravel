package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.DiscountCoupon;
import com.hy.hyTravel.mapper.DiscountCouponExample;
import com.hy.hyTravel.mapper.DiscountCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 优惠券
 */
@Service
public class DiscountCouponService {
    @Autowired
    private DiscountCouponMapper discountCouponMapper;

    public List<DiscountCoupon> getAll(){
        DiscountCouponExample example = new DiscountCouponExample();
        return  this.discountCouponMapper.selectByExample(example);
    }

    public DiscountCoupon selectCouponById(String id){
        return this.discountCouponMapper.selectByPrimaryKey(id);
    }

    public int updateCouponById(String id, DiscountCoupon coupon){
        return this.discountCouponMapper.updateByPrimaryKey(coupon);
    }

    public int insertCoupon(DiscountCoupon coupon){
        return this.discountCouponMapper.insert(coupon);
    }

    public int deleteCouponById(String id){
        return this.discountCouponMapper.deleteByPrimaryKey(id);
    }
}
