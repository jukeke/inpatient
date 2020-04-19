package com.example.app.dao;

import com.example.app.bean.Pinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface PinfoRepository extends JpaRepository<Pinfo,Integer> {
    //查询所有
    List<Pinfo> findAll();

    //根据病人编号查询一个
    @Query(nativeQuery = true,value = "select * from Pinfo where pno=:pno")
    List<Pinfo>findByPno(@Param("pno") String pno);

    //修改一条信息
    @Modifying
    @Query(nativeQuery = true,value = "update Pinfo set pphone=:pphone where pno=:pno")
    void updateOne(@Param("pphone") String pphone,@Param("pno") String pno);

    //删除一条信息
    @Modifying
    @Query(nativeQuery = true,value = "delete from Pinfo where pno=?1")
    void deleteOne(String pno);
}
