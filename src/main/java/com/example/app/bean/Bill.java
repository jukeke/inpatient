package com.example.app.bean;

import javax.persistence.*;

@Entity
@Table(name="bill")
public class Bill {

    @Id
    @GeneratedValue
    private Integer Id;

    @Column
    private String ino;

    @Column
    private String dno;

    @Column
    private String pno;

    @Column
    private String mno;

    public Bill(){}

    public Bill(String ino, String dno, String pno, String mno){
        this.ino=ino;
        this.dno=dno;
        this.pno=pno;
        this.mno=mno;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getIno() {
        return ino;
    }

    public void setIno(String ino) {
        this.ino = ino;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }
}