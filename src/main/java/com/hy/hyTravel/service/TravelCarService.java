package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.TravelCar;
import com.hy.hyTravel.mapper.TravelCarExample;
import com.hy.hyTravel.mapper.TravelCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆管理
 */
@Service
public class TravelCarService {

    @Autowired
    private TravelCarMapper travelCarMapper;

    public List<TravelCar> getAll(){
        TravelCarExample travelCarExample = new TravelCarExample();
        return travelCarMapper.selectByExample(travelCarExample);
    }

    public TravelCar selectTravelCarById(String id){
        return travelCarMapper.selectByPrimaryKey(id);
    }

    public int insertTravelCar(TravelCar travelCar){
        return travelCarMapper.insert(travelCar);
    }

    public int updateTravelCarByid(String id, TravelCar travelCar){
        return travelCarMapper.updateByPrimaryKey(travelCar);
    }

    public int deleteTravelCarById(String id){
        return travelCarMapper.deleteByPrimaryKey(id);
    }
}
