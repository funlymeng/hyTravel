package com.hy.hyTravel.mapper;

import com.hy.hyTravel.entity.GroupLeader;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface GroupLeaderMapper {
    long countByExample(GroupLeaderExample example);

    int deleteByExample(GroupLeaderExample example);

    int deleteByPrimaryKey(String leaderId);

    int insert(GroupLeader record);

    int insertSelective(GroupLeader record);

    List<GroupLeader> selectByExample(GroupLeaderExample example);

    GroupLeader selectByPrimaryKey(String leaderId);

    int updateByExampleSelective(@Param("record") GroupLeader record, @Param("example") GroupLeaderExample example);

    int updateByExample(@Param("record") GroupLeader record, @Param("example") GroupLeaderExample example);

    int updateByPrimaryKeySelective(GroupLeader record);

    int updateByPrimaryKey(GroupLeader record);
}