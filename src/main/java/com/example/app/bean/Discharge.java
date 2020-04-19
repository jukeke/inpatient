package com.example.app.bean;

import javax.persistence.*;

@Entity
@Table(name="Discharge")
public class Discharge {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String dno;//出院编号
    @Column
    private String pno;//病人编号
    @Column
    private String name;//病人姓名
    @Column
    private String ddate;//出院日期
public Discharge(){}
    public Discharge(String dno, String pno, String name, String ddate) {
        this.dno = dno;
        this.pno = pno;
        this.name = name;
        this.ddate = ddate;
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

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }
}
