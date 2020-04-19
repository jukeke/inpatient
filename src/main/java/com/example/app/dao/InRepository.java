package com.example.app.dao;

import com.example.app.bean.Inpatient;
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
public interface InRepository extends JpaRepository<Inpatient,Integer> {
    //查询所有
    List<Inpatient> findAll();
    //根据编号查询
    @Query(nativeQuery = true,value = "select * from Inpatient where ino=:ino")
    List<Inpatient> findByIno(@Param("ino") String ino);
    //修改
    @Modifying
    @Query(nativeQuery = true,value = "update Inpatient set room=:room where ino=:ino")
    void updateOne(@Param("room") String room,@Param("ino") String ino);
    //删除
    @Modifying
    @Query(nativeQuery = true,value = "delete from Inpatient where ino=?1")
    void deleteOne(String ino);

}
