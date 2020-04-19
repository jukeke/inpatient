package com.example.app.bean;

import javax.persistence.*;

@Entity
@Table(name="Pinfo")
public class Pinfo {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String pno;
    @Column
    private String pname;
    @Column
    private String pphone;
    @Column
    private String page;
    @Column
    private String sex;
    @Column
    private String sector;
public Pinfo(){}
    public Pinfo(String pno, String pname, String pphone, String page, String sex, String sector) {
        this.pno = pno;
        this.pname = pname;
        this.pphone = pphone;
        this.page = page;
        this.sex = sex;
        this.sector = sector;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
