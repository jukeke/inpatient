package com.example.app.dao;

import com.example.app.bean.Sector;
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
public interface SectorRespository extends JpaRepository<Sector,Integer> {
    //查询所有
    List<Sector> findAll();
    //根据编号查
    @Query(nativeQuery = true,value = "select * from Sector where sno=:sno")
    List<Sector> findBySno(@Param("sno") String sno);
    //修改
    @Modifying
    @Query(nativeQuery = true,value = "update Sector set sname=:sname where sno=:sno")
    void updateOne(@Param("sname") String sname,@Param("sno") String sno);
    //删除
    @Modifying
    @Query(nativeQuery = true,value = "delete from Sector where sno=?1")
    void deleteOne(String sno);

}
