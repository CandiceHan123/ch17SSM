package cn.edu.ujn.ch17.dao;

import java.util.Date;

public class Memberrecord {
    private Integer id;

    private String telephone;

    private Date approach;

    private Date depart;

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

    public Date getApproach() {
        return approach;
    }

    public void setApproach(Date approach) {
        this.approach = approach;
    }

    public Date getDepart() {
        return depart;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }
}