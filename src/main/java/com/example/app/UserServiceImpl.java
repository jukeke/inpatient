package com.example.app;

import com.example.app.bean.User;
import com.example.app.dao.UserRepository;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findByUserName(String name) {
        List<User> m = userRepository.findByUserName(name);
        if (m.size() == 0){
            return null;
        }
        return m;
    }

    @Override
    public String findByNameAndPassWord(String name, String password) {
        return userRepository.findByUserNameAndAndPassword(name,password)==null?"failed":"success";
    }


    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
