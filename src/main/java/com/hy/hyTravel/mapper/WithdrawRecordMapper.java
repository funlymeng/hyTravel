package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.WithdrawRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WithdrawRecordMapper {
    long countByExample(WithdrawRecordExample example);

    int deleteByExample(WithdrawRecordExample example);

    int insert(WithdrawRecord record);

    int insertSelective(WithdrawRecord record);

    List<WithdrawRecord> selectByExample(WithdrawRecordExample example);

    int updateByExampleSelective(@Param("record") WithdrawRecord record, @Param("example") WithdrawRecordExample example);

    int updateByExample(@Param("record") WithdrawRecord record, @Param("example") WithdrawRecordExample example);
}