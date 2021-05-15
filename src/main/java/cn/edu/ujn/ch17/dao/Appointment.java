package cn.edu.ujn.ch17.dao;

import java.util.Date;

public class Appointment {
    public Integer id;
    public String telephone;
    public String coachid;
    public Date appointtime;
    public Date endtime;
    public Boolean complete;

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
        this.telephone = telephone;
    }

    public String getCoachid() {
        return coachid;
    }

    public void setCoachid(String coachid) {
        this.coachid = coachid;
    }

    public Date getAppointtime() {
        return appointtime;
    }

    public void setAppointtime(Date appointtime) {
        this.appointtime = appointtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

}
