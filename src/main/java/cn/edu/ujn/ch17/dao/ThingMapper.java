package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Thing;

import java.sql.Timestamp;
import java.util.List;

public interface ThingMapper {
    int deleteByPrimaryKey(String name);

    int insert(Thing record);

    int insertSelective(Thing record);

    Thing selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);

    List<Thing> selectAll();

}