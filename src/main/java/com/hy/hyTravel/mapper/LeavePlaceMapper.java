package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.LeavePlace;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface LeavePlaceMapper {
    long countByExample(LeavePlaceExample example);

    int deleteByExample(LeavePlaceExample example);

    int deleteByPrimaryKey(String leaveId);

    int insert(LeavePlace record);

    int insertSelective(LeavePlace record);

    List<LeavePlace> selectByExample(LeavePlaceExample example);

    LeavePlace selectByPrimaryKey(String leaveId);

    int updateByExampleSelective(@Param("record") LeavePlace record, @Param("example") LeavePlaceExample example);

    int updateByExample(@Param("record") LeavePlace record, @Param("example") LeavePlaceExample example);

    int updateByPrimaryKeySelective(LeavePlace record);

    int updateByPrimaryKey(LeavePlace record);
}