package com.daisy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.entity
 * @Description:
 * @date 2019/6/20 20:56
 */
public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private String password;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date date;

    public User() {
    }

    public User(int id, String name, int age, String password, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
