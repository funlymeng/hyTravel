package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.GatheringPlace;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface GatheringPlaceMapper {
    long countByExample(GatheringPlaceExample example);

    int deleteByExample(GatheringPlaceExample example);

    int deleteByPrimaryKey(String gatheringId);

    int insert(GatheringPlace record);

    int insertSelective(GatheringPlace record);

    List<GatheringPlace> selectByExample(GatheringPlaceExample example);

    GatheringPlace selectByPrimaryKey(String gatheringId);

    int updateByExampleSelective(@Param("record") GatheringPlace record, @Param("example") GatheringPlaceExample example);

    int updateByExample(@Param("record") GatheringPlace record, @Param("example") GatheringPlaceExample example);

    int updateByPrimaryKeySelective(GatheringPlace record);

    int updateByPrimaryKey(GatheringPlace record);
}