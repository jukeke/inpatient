package com.example.app.controller;
import com.example.app.bean.Bill;
import com.example.app.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;
    @PostMapping(value = "/findByIno")
    public List<Bill> findByIno(@RequestBody Bill bill){
        return billService.findByIno(bill);
    }

    @GetMapping(value = "/bill/findByPnoAndDno")
    public String findByPnoAndDno(@Param("pno") String pno, @Param("dno") String dno){
        System.out.println(pno);
        System.out.println(dno);
        return billService.findByPnoAndDno(pno, dno);
    }

    @GetMapping("/findAllBill")
    public List<Bill> findAllBill(){
        return billService.findAllBill();
    }
    @PostMapping(value = "/deleteByIno")
    public void deleteByIno(@RequestBody Bill bill ){
         billService.deleteByIno(bill);
    }

    @PostMapping(value = "/upDataBill")
    public void updateMno(@RequestBody Bill bill){
        billService.updateBill(bill);
    }

    @PostMapping(value = "/addBill")
    public void addBill(@RequestBody Bill bill){
        billService.addBill(bill);
    }
}
