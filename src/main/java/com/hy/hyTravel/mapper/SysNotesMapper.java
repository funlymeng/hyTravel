package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.SysNotes;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysNotesMapper {
    long countByExample(SysNotesExample example);

    int deleteByExample(SysNotesExample example);

    int deleteByPrimaryKey(String noteId);

    int insert(SysNotes record);

    int insertSelective(SysNotes record);

    List<SysNotes> selectByExample(SysNotesExample example);

    SysNotes selectByPrimaryKey(String noteId);

    int updateByExampleSelective(@Param("record") SysNotes record, @Param("example") SysNotesExample example);

    int updateByExample(@Param("record") SysNotes record, @Param("example") SysNotesExample example);

    int updateByPrimaryKeySelective(SysNotes record);

    int updateByPrimaryKey(SysNotes record);
}