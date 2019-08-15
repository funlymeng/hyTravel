package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.TravelDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TravelDetailsMapper {
    long countByExample(TravelDetailsExample example);

    int deleteByExample(TravelDetailsExample example);

    int insert(TravelDetails record);

    int insertSelective(TravelDetails record);

    List<TravelDetails> selectByExample(TravelDetailsExample example);

    int updateByExampleSelective(@Param("record") TravelDetails record, @Param("example") TravelDetailsExample example);

    int updateByExample(@Param("record") TravelDetails record, @Param("example") TravelDetailsExample example);
}