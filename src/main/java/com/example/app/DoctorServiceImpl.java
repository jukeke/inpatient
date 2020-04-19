package com.example.app;

import com.example.app.bean.Doctor;
import com.example.app.dao.DoctorRespository;
import com.example.app.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRespository dr;
    //查找所有
    @Override
    public List<Doctor> findAll() {
        return dr.findAll();
    }
//查找一个
    @Override
    public List<Doctor> findByDno(String dno) {
        return dr.findByDno(dno);
    }
//删除
    @Override
    public void deleteOne(Doctor doctor) {
dr.deleteOne(doctor.getDno());
    }
//修改
    @Override
    public void updateOne(Doctor doctor) {
dr.updateOne(doctor.getDname(),doctor.getDno());
    }
//增加
    @Override
    public void addOne(Doctor doctor) {
        dr.save(doctor);
    }
}
