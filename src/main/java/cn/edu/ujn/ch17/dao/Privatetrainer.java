package cn.edu.ujn.ch17.dao;

public class Privatetrainer {
    private String id;

    private String name;

    private Integer level;

    private Integer age;

    private String sex;

    private Float hourlywage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Float getHourlywage() {
        return hourlywage;
    }

    public void setHourlywage(Float hourlywage) {
        this.hourlywage = hourlywage;
    }
}