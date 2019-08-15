package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.MyMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MyMessageMapper {
    long countByExample(MyMessageExample example);

    int deleteByExample(MyMessageExample example);

    int insert(MyMessage record);

    int insertSelective(MyMessage record);

    List<MyMessage> selectByExample(MyMessageExample example);

    int updateByExampleSelective(@Param("record") MyMessage record, @Param("example") MyMessageExample example);

    int updateByExample(@Param("record") MyMessage record, @Param("example") MyMessageExample example);
}