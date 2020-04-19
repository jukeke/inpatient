package com.example.app.service;

import com.example.app.bean.Doctor;
import java.util.List;
public interface DoctorService {
     List<Doctor> findAll();
    List<Doctor> findByDno(String dno);
    void deleteOne(Doctor doctor);
    void updateOne(Doctor doctor);
    void addOne(Doctor doctor);
}
