package com.example.app.service;

import com.example.app.bean.Sector;
import java.util.List;
public interface SectorService {
    List<Sector> findAll();
    List<Sector> findBySno(String sno);
    void deleteOne(Sector Sector);
    void updateOne(Sector Sector);
    void addOne(Sector Sector);
}
