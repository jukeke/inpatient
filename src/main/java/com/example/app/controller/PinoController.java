package com.example.app.controller;

import com.example.app.bean.Pinfo;
import com.example.app.dao.PinfoRepository;
import com.example.app.service.PinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pinfo")
public class PinoController {
    @Autowired
  private PinfoService pinfoService;
    //查询所有
    @GetMapping("/findall")
   public List<Pinfo> findAll(){
        //调用dao中的方法对数据库操作
        return pinfoService.findAll();
    }
    //查询一条信息
    @PostMapping("/findone")
    public List<Pinfo> findOne(@RequestBody Pinfo pinfo){
        return pinfoService.findByPno(pinfo.getPno());
    }
    //修改
    @PostMapping("/updateone")
   public void updateOne(@RequestBody Pinfo pinfo){
        pinfoService.updateOne(pinfo);
    }
    //删除
    @PostMapping("/deleteone")
    public void deleteOne(@RequestBody Pinfo pinfo){
        pinfoService.deleteOne(pinfo);
    }
    //添加
    @PostMapping("/addone")
    public void addOne(@RequestBody Pinfo pinfo){pinfoService.addOne(pinfo);}
}
