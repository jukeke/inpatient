package com.example.app;

import com.example.app.bean.Pinfo;
import com.example.app.dao.PinfoRepository;
import com.example.app.service.PinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PinfoServiceImpl implements PinfoService {
@Autowired
private PinfoRepository pr;
//查找所有
    @Override
    public List<Pinfo> findAll() {
        return pr.findAll();
    }
//根据病人编号查找一条
    @Override
    public List<Pinfo> findByPno(String pno) {
        return pr.findByPno(pno);
    }
//增加
    @Override
    public void addOne(Pinfo pinfo) {
        if(findByPno(pinfo.getPno())!=null)
            return;
        pr.save(pinfo);
    }
//删除
    @Override
    public void deleteOne(Pinfo pinfo) {
    pr.deleteOne(pinfo.getPno());
    }
//修改
    @Override
    public void updateOne(Pinfo pinfo) {
     pr.updateOne(pinfo.getPphone(),pinfo.getPno());
    }
}
