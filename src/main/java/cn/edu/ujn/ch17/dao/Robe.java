package cn.edu.ujn.ch17.dao;

public class Robe {
    private Integer id;

    private Boolean occupied;

    private Float rent;

    private String telephone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Float getRent() {
        return rent;
    }

    public void setRent(Float rent) {
        this.rent = rent;
    }

    public String getTelephone(){return  telephone;}

    public void setTelephone(String telephone){this.telephone=telephone;}
}