package com.example.app.dao;
import com.example.app.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findAll();

    List<User> findByUserName(String name);


    User findByUserNameAndAndPassword(String userName, String password);
}
