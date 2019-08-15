package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.LeavePlace;
import com.hy.hyTravel.mapper.LeavePlaceExample;
import com.hy.hyTravel.mapper.LeavePlaceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 散团地
 */
@Service
public class LeavePlaceService {

    @Autowired
    private LeavePlaceMapper leavePlaceMapper;

    public List<LeavePlace> getAll(){
        LeavePlaceExample leavePlaceExample = new LeavePlaceExample();
        return leavePlaceMapper.selectByExample(leavePlaceExample);
    }

    public LeavePlace selectLeavePlaceById(String id){
        return leavePlaceMapper.selectByPrimaryKey(id);
    }

    public int insertLeavePlace(LeavePlace leavePlace){
        return leavePlaceMapper.insert(leavePlace);
    }

    public int updateLeavePlaceById(String id, LeavePlace leavePlace){
        return leavePlaceMapper.updateByPrimaryKey(leavePlace);
    }

    public int deleteLeavePlaceById(String id){
        return leavePlaceMapper.deleteByPrimaryKey(id);
    }
}
