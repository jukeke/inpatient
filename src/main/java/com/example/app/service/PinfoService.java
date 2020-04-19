package com.example.app.service;

import com.example.app.bean.Pinfo;

import java.util.List;

public interface PinfoService {
    //查找所有
    List<Pinfo>findAll();
    //用病人编号查找
    List<Pinfo>findByPno(String pno);
    //增加一则信息
    void addOne(Pinfo pinfo);
    //删除一则信息
    void deleteOne(Pinfo pinfo);
    //修改信息
    void updateOne(Pinfo pinfo);
}
