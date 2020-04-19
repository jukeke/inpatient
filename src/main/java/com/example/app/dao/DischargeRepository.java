package com.example.app.dao;

import com.example.app.bean.Discharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface DischargeRepository extends JpaRepository<Discharge,Integer> {
    //查找所有
    List<Discharge> findAll();
    //查找一条
    @Query(nativeQuery = true,value = "select * from Discharge where dno=:dno")
    List<Discharge> findByDno(@Param("dno") String dno);
    //删除
    @Modifying
    @Query(nativeQuery = true,value = "delete from Discharge where dno=?1")
    void deleteOne(String dno);
    //修改
    @Modifying
    @Query(nativeQuery = true,value = "update Dicharge set ddate=:ddate where dno=:dno")
    void updateOne(@Param("ddate") String ddate,@Param("dno") String dno);
}
