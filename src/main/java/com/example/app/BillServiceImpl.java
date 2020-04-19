package com.example.app;

import com.example.app.bean.Bill;
import com.example.app.dao.BillRepository;
import com.example.app.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BillServiceImpl implements BillService{

    @Autowired
    private BillRepository billRepository;


    @Override
    public List<Bill> findByIno(Bill bill){
        List<Bill> m=billRepository.findByIno(bill.getIno());
        if (m.size()==0){
            return null;
        }
        return m;
    }

    @Override
    public String findByPnoAndDno(String pno,String dno){
        return billRepository.findByPnoAndDno(pno, dno)==null?"failed":"success";
    }

    @Override
    public List<Bill> findAllBill(){return billRepository.findAll();}

    @Override
    public void deleteByIno(Bill bill){
        billRepository.deleteByIno(bill.getIno());
    }

    @Override
    public void addBill(Bill bill){
        if(findByIno(bill)!=null)return;
        billRepository.save(bill);
    }

    @Override
    public void updateBill(Bill bill){
        billRepository.updateMnoByIno(bill.getMno(),bill.getIno());
    }
}
