package com.hy.hyTravel.service;

import com.hy.hyTravel.entity.SysNotes;
import com.hy.hyTravel.mapper.SysNotesExample;
import com.hy.hyTravel.mapper.SysNotesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysNotesService {
    @Autowired
    private SysNotesMapper sysNotesMapper;

    public List<SysNotes> getAll(){
        SysNotesExample sysNotesExample = new SysNotesExample();
        return sysNotesMapper.selectByExample(sysNotesExample);
    }

    public SysNotes selectSysNoteById(String id){
        return sysNotesMapper.selectByPrimaryKey(id);
    }

    public int insertSysNote(SysNotes sysNotes){
        return sysNotesMapper.insert(sysNotes);
    }

    public int updateSysNoteById(String id, SysNotes sysNotes){
        return sysNotesMapper.updateByPrimaryKey(sysNotes);
    }
}
