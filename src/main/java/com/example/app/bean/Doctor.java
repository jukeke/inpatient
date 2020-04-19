package com.example.app.bean;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="Doctor")
public class Doctor {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String dno;//编号
    @Column
    private String dname;//医生姓名
    @Column
    private String age;//年龄
    @Column
    private String sex;//性别
    @Column
    private String phone;//联系电话
    @Column
    private String sector;//所属部门
    public Doctor(){}

    public Doctor(String dno, String dname, String age, String sex, String phone, String sector) {
        this.dno = dno;
        this.dname = dname;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.sector = sector;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
