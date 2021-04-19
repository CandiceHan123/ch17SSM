package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Salesrecord;
import cn.edu.ujn.ch17.dao.SalesrecordExample;

import java.sql.Timestamp;
import java.util.List;

public interface SalesrecordMapper {
    int deleteByExample(SalesrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salesrecord record);

    int insertSelective(Salesrecord record);

    List<Salesrecord> selectByExample(SalesrecordExample example);

    Salesrecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesrecord record);

    int updateByPrimaryKey(Salesrecord record);

    List<Salesrecord> selectAll();

    List<Salesrecord> selectByTele(String telephone);

    List<Salesrecord> selectByThingsName(String thingsName);

    List<Salesrecord> selectByMonth(String time1,String time2);
}