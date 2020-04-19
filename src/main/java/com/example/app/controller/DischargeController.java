package com.example.app.controller;

import com.example.app.bean.Discharge;
import com.example.app.service.DischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discharge")
public class DischargeController {
    @Autowired
    private DischargeService ds;
    @GetMapping("/findall")
    public List<Discharge> findAll(){
        return ds.findAll();
    }
    @PostMapping("/findone")
    public List<Discharge> findByDno(@RequestBody Discharge discharge){
        return ds.findOne(discharge.getDno());
    }
    @PostMapping("/deleteone")
    public void deleteOne(@RequestBody Discharge discharge){
        ds.deleteOne(discharge);
    }
    @PostMapping("/updateone")
    public void updateOne(@RequestBody Discharge discharge){
        ds.updateOne(discharge);
    }
    @PostMapping("/addone")
    public void addOne(@RequestBody Discharge discharge){
        ds.addOne(discharge);
    }
}
