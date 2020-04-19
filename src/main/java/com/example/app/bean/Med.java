package com.example.app.bean;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="Med")
public class Med {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String mno;//编号
    @Column
    private String name;//名称
    @Column
    private String price;//价格

    public Med() {
    }

    public Med(String mno, String name, String price) {
        this.mno = mno;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
