package com.example.app;

import com.example.app.bean.Inpatient;
import com.example.app.dao.InRepository;
import com.example.app.service.InService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class InServiceImpl implements InService {
    @Autowired
    private InRepository dr;
    //查找所有
    @Override
    public List<Inpatient> findAll() {
        return dr.findAll();
    }
    //查找一个
    @Override
    public List<Inpatient> findByIno(String ino) {
        return dr.findByIno(ino);
    }
    //删除
    @Override
    public void deleteOne(Inpatient Inpatient) {
        dr.deleteOne(Inpatient.getIno());
    }
    //修改
    @Override
    public void updateOne(Inpatient Inpatient) {
        dr.updateOne(Inpatient.getRoom(),Inpatient.getIno());
    }
    //增加
    @Override
    public void addOne(Inpatient Inpatient) {
        dr.save(Inpatient);
    }
}
