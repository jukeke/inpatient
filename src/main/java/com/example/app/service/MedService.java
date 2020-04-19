package com.example.app.service;

import com.example.app.bean.Med;
import java.util.List;
public interface MedService {
    List<Med> findAll();
    List<Med> findByNo(String mno);
    void deleteOne(Med Med);
    void updateOne(Med Med);
    void addOne(Med Med);
}
