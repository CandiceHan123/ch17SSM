package cn.edu.ujn.ch17.dao;

import java.util.Date;

public class Purchasething {
    private Integer id;
    private String name;
    private Date purchaseDate;
    private Boolean isreturn;
    private Integer sum;

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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Boolean getIsreturn() {
        return isreturn;
    }

    public void setIsreturn(Boolean isreturn) {
        this.isreturn = isreturn;
    }
    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
