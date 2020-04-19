package com.example.app.controller;
import com.example.app.bean.Sector;
import com.example.app.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sector")
public class SectorController {
    @Autowired
    private SectorService ds;
    //查找所有
    @GetMapping("/findall")
    public List<Sector> findAll(){
        return ds.findAll();
    }
    //查找一条
    @PostMapping("/findone")
    public List<Sector> findOne(@RequestBody Sector Sector){
        return ds.findBySno(Sector.getSno());
        //参数传递的是Sno;
    }
    //删除
    @PostMapping("/deleteone")
    public void deleteOne(@RequestBody Sector Sector){
        ds.deleteOne(Sector);
    }
    //增加
    @PostMapping("/addone")
    public void addOne(@RequestBody Sector Sector){
        ds.addOne(Sector);
    }
    //更新
    @PostMapping("updateone")
    public void updateOne(@RequestBody Sector Sector){
        ds.updateOne(Sector);
    }
}
