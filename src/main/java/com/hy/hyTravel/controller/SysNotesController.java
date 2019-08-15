package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.SysNotes;
import com.hy.hyTravel.service.SysNotesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户留言
 */
@RestController
@RequestMapping(value = "/sysNotes")
public class SysNotesController {
    private Logger loger = LoggerFactory.getLogger(SysNotesController.class);

    @Autowired
    private SysNotesService sysNotesService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<SysNotes> getAll(){
        List<SysNotes> list  =  new ArrayList<>();
        list = sysNotesService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public SysNotes selectSysNoteById(@PathVariable("id")String id){
        return this.sysNotesService.selectSysNoteById(id);
    }


    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertSysNote(@RequestBody SysNotes sysNotes){
        int i = this.sysNotesService.insertSysNote(sysNotes);
        if (i>0)
            return new ResultMessage(1,"添加成功",null);
        return new ResultMessage(0,"添加失败",null);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateSysNoteById(@PathVariable("id")String id,@RequestBody SysNotes sysNotes){
        int i = this.sysNotesService.updateSysNoteById(id,sysNotes);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

}
