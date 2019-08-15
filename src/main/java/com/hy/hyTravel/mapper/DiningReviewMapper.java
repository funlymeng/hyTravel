package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.DiningReview;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DiningReviewMapper {
    long countByExample(DiningReviewExample example);

    int deleteByExample(DiningReviewExample example);

    int insert(DiningReview record);

    int insertSelective(DiningReview record);

    List<DiningReview> selectByExample(DiningReviewExample example);

    int updateByExampleSelective(@Param("record") DiningReview record, @Param("example") DiningReviewExample example);

    int updateByExample(@Param("record") DiningReview record, @Param("example") DiningReviewExample example);
}