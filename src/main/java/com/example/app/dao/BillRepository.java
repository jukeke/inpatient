package com.example.app.dao;
import com.example.app.bean.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BillRepository extends JpaRepository<Bill,Integer> {

    List<Bill> findAll();

    @Query(nativeQuery = true,value = "SELECT * FROM Bill WHERE ino=:ino")
    List<Bill> findByIno(@Param("ino") String ino);

    @Query(nativeQuery = true,value = "SELECT * FROM Bill WHERE pno=?1 AND dno=?2")
    Bill findByPnoAndDno(String pno, String dno);

//    @Modifying
//    @Query(nativeQuery = true,value = "INSERT INTO Bill VALUES(?1,?2,?3,?4) ")
//    Integer  addBill(String ino,String dno,String pno,String mno);

    @Modifying
    @Query(nativeQuery = true,value = "UPDATE Bill SET mno=:mno WHERE ino=:ino")
    Integer updateMnoByIno(@Param("mno") String mno, @Param("ino") String ino);


    @Modifying
    @Query(nativeQuery =true,value = "DELETE FROM Bill WHERE ino =?1")
    Integer deleteByIno(String ino);
}
