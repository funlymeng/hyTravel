package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.GroupLeader;
import com.hy.hyTravel.mapper.GroupLeaderExample;
import com.hy.hyTravel.mapper.GroupLeaderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 领队管理
 */
@Service
public class GroupLeaderService {
    @Autowired
    private GroupLeaderMapper groupLeaderMapper;

    public List<GroupLeader> getAll(){
        GroupLeaderExample groupLeaderExample = new GroupLeaderExample();
        return groupLeaderMapper.selectByExample(groupLeaderExample);
    }

    public GroupLeader selectGroupLeaderById(String id){
        return groupLeaderMapper.selectByPrimaryKey(id);
    }

    public int insertGroupLeader(GroupLeader groupLeader){
        return groupLeaderMapper.insert(groupLeader);
    }

    public int updateGroupLeaderById(String id, GroupLeader groupLeader){
        return groupLeaderMapper.updateByPrimaryKey(groupLeader);
    }

    public int deleteGroupLeaderById(String id){
        return groupLeaderMapper.deleteByPrimaryKey(id);
    }
}
