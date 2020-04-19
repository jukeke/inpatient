package com.example.app.dao;

import com.example.app.bean.Med;
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
public interface MedRespository extends JpaRepository<Med,Integer> {
    //查询所有
    List<Med> findAll();
    //根据编号查询
    @Query(nativeQuery = true,value = "select * from Med where mno=:mno")
    List<Med> findByMno(@Param("mno") String mno);
    //修改
    @Modifying
    @Query(nativeQuery = true,value = "update Med set price=:price where mno=:mno")
    void updateOne(@Param("price") String price,@Param("mno") String mno);
    //删除
    @Modifying
    @Query(nativeQuery = true,value = "delete from Med where mno=?1")
    void deleteOne(String mno);

}
