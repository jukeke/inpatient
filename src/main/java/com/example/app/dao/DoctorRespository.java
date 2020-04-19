package com.example.app.dao;

import com.example.app.bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import javax.transaction.Transactional;
import java.util.List;

//数据库的操作类
@Repository//注解1repository
@Transactional//注解2事务
public interface DoctorRespository extends JpaRepository<Doctor,Integer> {
    //查询所有
    List<Doctor> findAll();
    //根据编号查询
    @Query(nativeQuery = true,value = "select * from Doctor where dno=:dno")
    List<Doctor> findByDno(@Param("dno") String dno);
    //修改
    @Modifying
    @Query(nativeQuery = true,value = "update Doctor set dname=:dname where dno=:dno")
    void updateOne(@Param("dname") String dname,@Param("dno") String dno);
    //删除
    @Modifying
    @Query(nativeQuery = true,value = "delete from Doctor where dno=?1")
    void deleteOne(String dno);

}
