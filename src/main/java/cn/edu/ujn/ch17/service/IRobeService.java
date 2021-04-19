package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Robe;

import java.util.List;

public interface IRobeService {
    public List<Robe> showAllRobes();
    public int modifyById(Robe record);
    public int deleteById(int id);
}
