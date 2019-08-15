package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.GatheringPlace;
import com.hy.hyTravel.mapper.GatheringPlaceExample;
import com.hy.hyTravel.mapper.GatheringPlaceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 集合地
 */
@Service
public class GatheringPlaceService {

    @Autowired
    private GatheringPlaceMapper gatheringPlaceMapper;

    public List<GatheringPlace> getAll(){
        GatheringPlaceExample gatheringPlaceExample = new GatheringPlaceExample();
        return gatheringPlaceMapper.selectByExample(gatheringPlaceExample);
    }

    public GatheringPlace selectGatheringPlaceById(String id){
        return gatheringPlaceMapper.selectByPrimaryKey(id);
    }

    public int insertGatheringPlace(GatheringPlace gatheringPlace){
        return gatheringPlaceMapper.insert(gatheringPlace);
    }

    public int updateGatheringPlaceById(String id, GatheringPlace gatheringPlace){
        return gatheringPlaceMapper.updateByPrimaryKey(gatheringPlace);
    }

    public int deleteGatheringPlaceById(String id){
        return gatheringPlaceMapper.deleteByPrimaryKey(id);
    }

}
