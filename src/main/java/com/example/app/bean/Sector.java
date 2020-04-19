package com.example.app.bean;

import javax.persistence.*;

@Entity
@Table(name="Sector")
public class Sector {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String sno;//编号
    @Column
    private String sname;//部门名称
    @Column
    private String leader;//负责人
    @Column
    private String number;//人员数
    public Sector(){}

    public Sector(String sno, String sname, String leader, String number) {
        this.sno = sno;
        this.sname = sname;
        this.leader = leader;
        this.number = number;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
