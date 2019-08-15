package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.SysSet;
import com.hy.hyTravel.entity.SysSetKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysSetMapper {
    long countByExample(SysSetExample example);

    int deleteByExample(SysSetExample example);

    int deleteByPrimaryKey(SysSetKey key);

    int insert(SysSet record);

    int insertSelective(SysSet record);

    List<SysSet> selectByExample(SysSetExample example);

    SysSet selectByPrimaryKey(SysSetKey key);

    int updateByExampleSelective(@Param("record") SysSet record, @Param("example") SysSetExample example);

    int updateByExample(@Param("record") SysSet record, @Param("example") SysSetExample example);

    int updateByPrimaryKeySelective(SysSet record);

    int updateByPrimaryKey(SysSet record);
}