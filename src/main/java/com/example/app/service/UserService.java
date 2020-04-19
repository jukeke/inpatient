package com.example.app.service;

import com.example.app.bean.User;

import java.util.List;


public interface UserService {


    List<User> findByUserName(String name);

    String findByNameAndPassWord(String name, String password);

    List<User> findAllUser();

}
