package com.example.app;

import com.example.app.bean.Sector;
import com.example.app.dao.SectorRespository;
import com.example.app.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class SectorServiceImpl implements SectorService {
    @Autowired
    private SectorRespository dr;
    //查找所有
    @Override
    public List<Sector> findAll() {
        return dr.findAll();
    }
    //查找一个
    @Override
    public List<Sector> findBySno(String sno) {
        return dr.findBySno(sno);
    }
    //删除
    @Override
    public void deleteOne(Sector Sector) {
        dr.deleteOne(Sector.getSno());
    }
    //修改
    @Override
    public void updateOne(Sector Sector) {
        dr.updateOne(Sector.getSname(),Sector.getSno());
    }
    //增加
    @Override
    public void addOne(Sector Sector) {
        dr.save(Sector);
    }
}
