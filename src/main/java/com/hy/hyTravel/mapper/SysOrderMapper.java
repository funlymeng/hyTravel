package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.SysOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysOrderMapper {
    long countByExample(SysOrderExample example);

    int deleteByExample(SysOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    List<SysOrder> selectByExample(SysOrderExample example);

    SysOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") SysOrder record, @Param("example") SysOrderExample example);

    int updateByExample(@Param("record") SysOrder record, @Param("example") SysOrderExample example);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}