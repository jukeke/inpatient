package com.example.app.service;

import com.example.app.bean.Discharge;

import java.util.List;

public interface DischargeService {
    List<Discharge> findAll();
    List<Discharge> findOne(String dno);
    void deleteOne(Discharge discharge);
    void updateOne(Discharge discharge);
    void addOne(Discharge discharge);
}
