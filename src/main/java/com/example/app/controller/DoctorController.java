package com.example.app.controller;
import com.example.app.bean.Doctor;
import com.example.app.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService ds;
    //查找所有
    @GetMapping("/findall")
   public List<Doctor> findAll(){
        return ds.findAll();
    }
    //查找一条
    @PostMapping("/findone")
   public List<Doctor> findOne(@RequestBody Doctor doctor){
        return ds.findByDno(doctor.getDno());
        //参数传递的是dno;
    }
    //删除
    @PostMapping("/deleteone")
    public void deleteOne(@RequestBody Doctor doctor){
        ds.deleteOne(doctor);
    }
    //增加
    @PostMapping("/addone")
    public void addOne(@RequestBody Doctor doctor){
        ds.addOne(doctor);
    }
    //更新
    @PostMapping("updateone")
    public void updateOne(@RequestBody Doctor doctor){
        ds.updateOne(doctor);
    }
}
