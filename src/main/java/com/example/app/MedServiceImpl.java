package com.example.app;

import com.example.app.bean.Med;
import com.example.app.dao.MedRespository;
import com.example.app.service.MedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class MedServiceImpl implements MedService {
    @Autowired
    private MedRespository dr;
    //查找所有
    @Override
    public List<Med> findAll() {
        return dr.findAll();
    }
    //查找一个
    @Override
    public List<Med> findByNo(String mno) {
        return dr.findByMno(mno);
    }
    //删除
    @Override
    public void deleteOne(Med Med) {
        dr.deleteOne(Med.getMno());
    }
    //修改
    @Override
    public void updateOne(Med Med) {
        dr.updateOne(Med.getPrice(),Med.getMno());
    }
    //增加
    @Override
    public void addOne(Med Med) {
        dr.save(Med);
    }
}
