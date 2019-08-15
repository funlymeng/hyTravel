package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.DiningHall;
import com.hy.hyTravel.mapper.DiningHallExample;
import com.hy.hyTravel.mapper.DiningHallMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 餐厅美食
 */
@Service
public class DiningHallService {
    @Autowired
    private DiningHallMapper diningHallMapper;

    public List<DiningHall> getAll(){
        DiningHallExample diningHallExample = new DiningHallExample();
        return diningHallMapper.selectByExample(diningHallExample);
    }

    public DiningHall selectDiningHallById(String id){
        return diningHallMapper.selectByPrimaryKey(id);
    }

    public int insertDiningHall(DiningHall diningHall){
        return diningHallMapper.insert(diningHall);
    }

    public int updateDiningHallById(String id, DiningHall diningHall){
        return diningHallMapper.updateByPrimaryKey(diningHall);
    }

    public int deleteDiningHallById(String id){
        return diningHallMapper.deleteByPrimaryKey(id);
    }

}
