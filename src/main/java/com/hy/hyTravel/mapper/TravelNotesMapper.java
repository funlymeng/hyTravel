package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.TravelNotes;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TravelNotesMapper {
    long countByExample(TravelNotesExample example);

    int deleteByExample(TravelNotesExample example);

    int deleteByPrimaryKey(String noteId);

    int insert(TravelNotes record);

    int insertSelective(TravelNotes record);

    List<TravelNotes> selectByExample(TravelNotesExample example);

    TravelNotes selectByPrimaryKey(String noteId);

    int updateByExampleSelective(@Param("record") TravelNotes record, @Param("example") TravelNotesExample example);

    int updateByExample(@Param("record") TravelNotes record, @Param("example") TravelNotesExample example);

    int updateByPrimaryKeySelective(TravelNotes record);

    int updateByPrimaryKey(TravelNotes record);
}