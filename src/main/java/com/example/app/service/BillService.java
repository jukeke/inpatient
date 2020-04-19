package com.example.app.service;

import com.example.app.bean.Bill;

import java.util.List;

public interface BillService {
    List<Bill> findByIno(Bill bill);
    //用表单号查找
    String findByPnoAndDno(String pno, String dno);
    //用病人好和医生号查找
    List<Bill> findAllBill();
    //查找所有表单
    void addBill(Bill bill);

    void updateBill(Bill bill);

    void deleteByIno(Bill bill);
}
