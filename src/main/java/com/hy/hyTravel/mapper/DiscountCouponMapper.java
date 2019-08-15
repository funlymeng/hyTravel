package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.DiscountCoupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DiscountCouponMapper {
    long countByExample(DiscountCouponExample example);

    int deleteByExample(DiscountCouponExample example);

    int deleteByPrimaryKey(String discountId);

    int insert(DiscountCoupon record);

    int insertSelective(DiscountCoupon record);

    List<DiscountCoupon> selectByExample(DiscountCouponExample example);

    DiscountCoupon selectByPrimaryKey(String discountId);

    int updateByExampleSelective(@Param("record") DiscountCoupon record, @Param("example") DiscountCouponExample example);

    int updateByExample(@Param("record") DiscountCoupon record, @Param("example") DiscountCouponExample example);

    int updateByPrimaryKeySelective(DiscountCoupon record);

    int updateByPrimaryKey(DiscountCoupon record);
}