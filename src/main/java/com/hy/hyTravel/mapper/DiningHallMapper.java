package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.DiningHall;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DiningHallMapper {
    long countByExample(DiningHallExample example);

    int deleteByExample(DiningHallExample example);

    int deleteByPrimaryKey(String diningId);

    int insert(DiningHall record);

    int insertSelective(DiningHall record);

    List<DiningHall> selectByExample(DiningHallExample example);

    DiningHall selectByPrimaryKey(String diningId);

    int updateByExampleSelective(@Param("record") DiningHall record, @Param("example") DiningHallExample example);

    int updateByExample(@Param("record") DiningHall record, @Param("example") DiningHallExample example);

    int updateByPrimaryKeySelective(DiningHall record);

    int updateByPrimaryKey(DiningHall record);
}