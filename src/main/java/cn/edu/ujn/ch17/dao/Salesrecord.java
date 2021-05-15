package cn.edu.ujn.ch17.dao;

import java.util.Date;

public class Salesrecord {
    private Integer id;

    private String telephone;

    private String thingsname;

    private Integer number;

    private Float price;

    private Date time;

    private Boolean method;

    public Boolean getMethod() {
        return method;
    }

    public void setMethod(Boolean method) {
        this.method = method;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getThingsname() {
        return thingsname;
    }

    public void setThingsname(String thingsname) {
        this.thingsname = thingsname == null ? null : thingsname.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}