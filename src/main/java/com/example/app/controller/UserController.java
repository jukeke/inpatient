package com.example.app.controller;
import com.example.app.bean.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/findByUserName",method = RequestMethod.GET)
    public List<User> findByUserName(@RequestParam(value = "userName") String userName){
        return userService.findByUserName(userName);
    }

    @GetMapping(value = "/login")
    public String findAll(@Param("name") String name, @Param("password")String password){
        System.out.println(name);
        System.out.println(password);
        return userService.findByNameAndPassWord(name,password);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
