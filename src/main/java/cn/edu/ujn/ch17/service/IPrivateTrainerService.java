package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Privatetrainer;

import java.util.List;

public interface IPrivateTrainerService {
    public List<Privatetrainer> showAllTeachers();
    public List<Privatetrainer> findById(String id);
    public List<Privatetrainer> findByName(String name);
    public List<Privatetrainer> findByLevel(int level);
    public List<Privatetrainer> findBySex(String sex);
    public int modifyById(Privatetrainer record);
    public int deleteById(String id);
}
