package com.example.app.service;

import com.example.app.bean.Inpatient;
import java.util.List;
public interface InService {
    List<Inpatient> findAll();
    List<Inpatient> findByIno(String dno);
    void deleteOne(Inpatient Inpatient);
    void updateOne(Inpatient Inpatient);
    void addOne(Inpatient Inpatient);
}
