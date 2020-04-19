package com.example.app;

import com.example.app.bean.Discharge;
import com.example.app.dao.DischargeRepository;
import com.example.app.service.DischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DischargeServiceImpl implements DischargeService {
@Autowired
private DischargeRepository dr;
    @Override
    public List<Discharge> findAll() {
        return dr.findAll();
    }

    @Override
    public List<Discharge> findOne(String dno) {
        return dr.findByDno(dno);
    }

    @Override
    public void deleteOne(Discharge discharge) {
dr.deleteOne(discharge.getDno());
    }

    @Override
    public void updateOne(Discharge discharge) {
dr.updateOne(discharge.getDdate(),discharge.getDno());
    }

    @Override
    public void addOne(Discharge discharge) {
dr.save(discharge);
    }
}
