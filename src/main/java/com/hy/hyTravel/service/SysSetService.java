package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.SysSet;
import com.hy.hyTravel.entity.SysSetKey;
import com.hy.hyTravel.mapper.SysSetExample;
import com.hy.hyTravel.mapper.SysSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统设置
 */
@Service
public class SysSetService {

    @Autowired
    private SysSetMapper sysSetMapper;

    public List<SysSet> getAll(){
        SysSetExample sysSetExample = new SysSetExample();
        return sysSetMapper.selectByExample(sysSetExample);
    }

    public SysSet selectSysSetById(SysSetKey sysSetKey){
        return sysSetMapper.selectByPrimaryKey(sysSetKey);
    }

    public int insertSysSet(SysSet sysSet){
        return sysSetMapper.insert(sysSet);
    }

    public int updateSysSetById(SysSet sysSet){
        return sysSetMapper.updateByPrimaryKey(sysSet);
    }

    public int deleteSysSetById(SysSetKey sysSetKey){
        return sysSetMapper.deleteByPrimaryKey(sysSetKey);
    }
}
