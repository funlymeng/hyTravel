package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.extend.ConcernsVO;
import com.hy.hyTravel.mapper.MyConcernsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyConcernsService {

    @Autowired
    private MyConcernsMapper myConcernsMapper;

    /**
     * 查询我的关注 1/游记 2/行程单 3/领队 0/ALL
     * @param concernsVO
     * @return
     */
    public List<ConcernsVO> getAll(ConcernsVO concernsVO){
        List<ConcernsVO> list = new ArrayList<>();
        if ("1".equals(concernsVO.getConcernsType())){
            list = myConcernsMapper.selectTravelNotes(concernsVO);
        }else if ("2".equals(concernsVO.getConcernsType())){
            list = myConcernsMapper.selectTravelItinerary(concernsVO);
        }else {
            list = myConcernsMapper.selectTravelNotes(concernsVO);
            List<ConcernsVO> list2 = new ArrayList<>();
            list2 = myConcernsMapper.selectTravelItinerary(concernsVO);
            list.addAll(list2);
        }

        return list;
    }
}
