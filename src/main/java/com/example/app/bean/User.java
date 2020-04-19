package com.example.app.bean;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private  Integer Id;

    @Column
    private String userId;

    @Column
    private String userName;

    @Column
    private String userPhone;


    @Column
    private String password;

    public User(){}

    public User(String userId, String userName, String userPhone, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;

        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
