package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.Hotel;
import com.hy.hyTravel.mapper.HotelExample;
import com.hy.hyTravel.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 酒店
 */
@Service
public class HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    public List<Hotel> getAll(){
        HotelExample hotelExample = new HotelExample();
        return hotelMapper.selectByExample(hotelExample);
    }

    public Hotel selectHotelById(String id){
        return hotelMapper.selectByPrimaryKey(id);
    }

    public int insertHotel(Hotel hotel){
        return hotelMapper.insert(hotel);
    }

    public int updateHotelById(String id, Hotel hotel){
        return hotelMapper.updateByPrimaryKey(hotel);
    }

    public int deleteHotelById(String id){
        return hotelMapper.deleteByPrimaryKey(id);
    }
}
