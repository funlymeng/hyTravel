package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.PayRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PayRecordMapper {
    long countByExample(PayRecordExample example);

    int deleteByExample(PayRecordExample example);

    int insert(PayRecord record);

    int insertSelective(PayRecord record);

    List<PayRecord> selectByExample(PayRecordExample example);

    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordExample example);
}