package com.hy.hyTravel.controller;

import com.hy.hyTravel.common.FileUpload;
import com.hy.hyTravel.common.RedisUtil;
import com.hy.hyTravel.common.ResultMessage;
import com.hy.hyTravel.entity.DiningHall;
import com.hy.hyTravel.service.DiningHallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 美食餐厅
 */
@RestController
@RequestMapping(value = "/public/diningHall")
public class DiningHallContrller {
    private static final Logger loger = LoggerFactory.getLogger(DiningHallContrller.class);

    @Autowired
    private DiningHallService diningHallService;

    @Autowired
    private RedisUtil redisUtil;

    @Value("${system.upload.filePath}")
    private String filePath;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public List<DiningHall> getAll(){
        List<DiningHall> list  =  new ArrayList<>();
        list = diningHallService.getAll();
        return list;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.GET)
    public DiningHall selectDiningHallById(@PathVariable("id")String id){
        return this.diningHallService.selectDiningHallById(id);
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.PUT)
    public ResultMessage updateDiningHallById(@PathVariable("id")String id, @RequestBody DiningHall diningHall){
        int i = this.diningHallService.updateDiningHallById(id,diningHall);
        if (i>0)
            return new ResultMessage(1,"修改成功",null);
        return new ResultMessage(0,"修改失败",null);
    }

    /**
     * 新增
     * @return
     */
    @Transactional
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public ResultMessage insertDiningHall(@RequestParam(value = "file") MultipartFile file, @RequestBody DiningHall diningHall){
        FileUpload fileUpload = new FileUpload();
        //上传图片
        fileUpload.fileUpload(file);
        diningHall.setDiningImg(filePath);
        diningHall.setDiningId(UUID.randomUUID().toString());
        int i = this.diningHallService.insertDiningHall(diningHall);
        if (i>0)
            return new ResultMessage(1,"添加成功",null);
        return new ResultMessage(0,"添加失败",null);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/{id}",method = RequestMethod.DELETE)
    public ResultMessage deleteDiningHallById(@PathVariable("id")String id){
        int i = this.diningHallService.deleteDiningHallById(id);
        if (i>0)
            return new ResultMessage(1,"删除成功",null);
        return new ResultMessage(0,"删除失败",null);
    }


}
