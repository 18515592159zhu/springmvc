package com.zcf.entity;

import java.io.Serializable;

/**
 * 账户
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double monry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMonry() {
        return monry;
    }

    public void setMonry(Double monry) {
        this.monry = monry;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monry=" + monry +
                '}';
    }
}
