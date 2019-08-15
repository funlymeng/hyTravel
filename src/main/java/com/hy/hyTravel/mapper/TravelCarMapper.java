package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.TravelCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TravelCarMapper {
    long countByExample(TravelCarExample example);

    int deleteByExample(TravelCarExample example);

    int deleteByPrimaryKey(String carId);

    int insert(TravelCar record);

    int insertSelective(TravelCar record);

    List<TravelCar> selectByExample(TravelCarExample example);

    TravelCar selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") TravelCar record, @Param("example") TravelCarExample example);

    int updateByExample(@Param("record") TravelCar record, @Param("example") TravelCarExample example);

    int updateByPrimaryKeySelective(TravelCar record);

    int updateByPrimaryKey(TravelCar record);
}