package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.TravelItinerary;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TravelItineraryMapper {
    long countByExample(TravelItineraryExample example);

    int deleteByExample(TravelItineraryExample example);

    int insert(TravelItinerary record);

    int insertSelective(TravelItinerary record);

    List<TravelItinerary> selectByExample(TravelItineraryExample example);

    int updateByExampleSelective(@Param("record") TravelItinerary record, @Param("example") TravelItineraryExample example);

    int updateByExample(@Param("record") TravelItinerary record, @Param("example") TravelItineraryExample example);
}