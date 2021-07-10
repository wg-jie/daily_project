package com.jie.dao;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class Food {
    private Integer id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date starttime;


    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starttime=" + starttime +
                '}';
    }

    public Food() {
    }

    public Food(Integer id, String name, Date starttime) {
        this.id = id;
        this.name = name;
        this.starttime = starttime;
    }

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
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }
}
