package com.example.app.controller;
import com.example.app.bean.Med;
import com.example.app.service.MedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/med")
public class MedController {
    @Autowired
    private MedService ds;
    //查找所有
    @GetMapping("/findall")
    public List<Med> findAll(){
        return ds.findAll();
    }
    //查找一条
    @PostMapping("/findone")
    public List<Med> findOne(@RequestBody Med Med){
        return ds.findByNo(Med.getMno());
        //参数传递的是No;
    }
    //删除
    @PostMapping("/deleteone")
    public void deleteOne(@RequestBody Med Med){
        ds.deleteOne(Med);
    }
    //增加
    @PostMapping("/addone")
    public void addOne(@RequestBody Med Med){
        ds.addOne(Med);
    }
    //更新
    @PostMapping("updateone")
    public void updateOne(@RequestBody Med Med){
        ds.updateOne(Med);
    }
}
