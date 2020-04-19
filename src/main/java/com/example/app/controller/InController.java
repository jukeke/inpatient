package com.example.app.controller;
import com.example.app.bean.Inpatient;
import com.example.app.service.InService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class InController {
    @Autowired
    private InService ds;
    //查找所有
    @GetMapping("/findall")
    public List<Inpatient> findAll(){
        return ds.findAll();
    }
    //查找一条
    @PostMapping("/findone")
    public List<Inpatient> findOne(@RequestBody Inpatient Inpatient){
        return ds.findByIno(Inpatient.getIno());
        //参数传递的是dno;
    }
    //删除
    @PostMapping("/deleteone")
    public void deleteOne(@RequestBody Inpatient Inpatient){
        ds.deleteOne(Inpatient);
    }
    //增加
    @PostMapping("/addone")
    public void addOne(@RequestBody Inpatient Inpatient){
        ds.addOne(Inpatient);
    }
    //更新
    @PostMapping("/updateone")
    public void updateOne(@RequestBody Inpatient Inpatient){
        ds.updateOne(Inpatient);
    }
}
