package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Memberrecord;

import java.util.List;

public interface IMemberrecordService {
    public List<Memberrecord> findByTele(String telephone);

    public List<Memberrecord> findAll();
}
