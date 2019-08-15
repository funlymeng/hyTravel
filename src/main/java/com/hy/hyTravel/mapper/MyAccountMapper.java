package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.MyAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MyAccountMapper {
    long countByExample(MyAccountExample example);

    int deleteByExample(MyAccountExample example);

    int insert(MyAccount record);

    int insertSelective(MyAccount record);

    List<MyAccount> selectByExample(MyAccountExample example);

    int updateByExampleSelective(@Param("record") MyAccount record, @Param("example") MyAccountExample example);

    int updateByExample(@Param("record") MyAccount record, @Param("example") MyAccountExample example);
}