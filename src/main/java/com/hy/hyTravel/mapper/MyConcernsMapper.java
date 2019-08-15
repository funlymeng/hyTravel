package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.MyConcerns;
import com.hy.hyTravel.entity.extend.ConcernsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MyConcernsMapper {
    long countByExample(MyConcernsExample example);

    int deleteByExample(MyConcernsExample example);

    int deleteByPrimaryKey(String concernsId);

    int insert(MyConcerns record);

    int insertSelective(MyConcerns record);

    List<MyConcerns> selectByExample(MyConcernsExample example);

    MyConcerns selectByPrimaryKey(String concernsId);

    int updateByExampleSelective(@Param("record") MyConcerns record, @Param("example") MyConcernsExample example);

    int updateByExample(@Param("record") MyConcerns record, @Param("example") MyConcernsExample example);

    int updateByPrimaryKeySelective(MyConcerns record);

    int updateByPrimaryKey(MyConcerns record);

    List<ConcernsVO> selectTravelNotes(@Param("record") ConcernsVO record);

    List<ConcernsVO> selectTravelItinerary(@Param("record") ConcernsVO record);
}