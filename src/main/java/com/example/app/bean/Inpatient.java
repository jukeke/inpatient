package com.example.app.bean;

import javax.persistence.*;

@Entity
@Table(name="Inpatient")
public class Inpatient {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String ino;//编号
    @Column
    private String pname;//病人·姓名
    @Column
    private String illness;//疾病
    @Column
    private String care;//负责医生
    @Column
    private String room;//病房号码
    public Inpatient(){}

    public Inpatient(String ino, String pname, String illness, String care, String room) {
        this.ino = ino;
        this.pname = pname;
        this.illness = illness;
        this.care = care;
        this.room = room;
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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getCare() {
        return care;
    }

    public void setCare(String care) {
        this.care = care;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
