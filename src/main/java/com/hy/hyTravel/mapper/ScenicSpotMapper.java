package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.ScenicSpot;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ScenicSpotMapper {
    long countByExample(ScenicSpotExample example);

    int deleteByExample(ScenicSpotExample example);

    int deleteByPrimaryKey(String scenicId);

    int insert(ScenicSpot record);

    int insertSelective(ScenicSpot record);

    List<ScenicSpot> selectByExample(ScenicSpotExample example);

    ScenicSpot selectByPrimaryKey(String scenicId);

    int updateByExampleSelective(@Param("record") ScenicSpot record, @Param("example") ScenicSpotExample example);

    int updateByExample(@Param("record") ScenicSpot record, @Param("example") ScenicSpotExample example);

    int updateByPrimaryKeySelective(ScenicSpot record);

    int updateByPrimaryKey(ScenicSpot record);
}