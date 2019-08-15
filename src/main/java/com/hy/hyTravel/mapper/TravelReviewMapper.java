package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.TravelReview;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TravelReviewMapper {
    long countByExample(TravelReviewExample example);

    int deleteByExample(TravelReviewExample example);

    int insert(TravelReview record);

    int insertSelective(TravelReview record);

    List<TravelReview> selectByExample(TravelReviewExample example);

    int updateByExampleSelective(@Param("record") TravelReview record, @Param("example") TravelReviewExample example);

    int updateByExample(@Param("record") TravelReview record, @Param("example") TravelReviewExample example);
}