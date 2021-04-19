package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Robe;
import cn.edu.ujn.ch17.dao.RobeExample;
import java.util.List;

public interface RobeMapper {
    int deleteByExample(RobeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Robe record);

    int insertSelective(Robe record);

    List<Robe> selectByExample(RobeExample example);

    Robe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Robe record);

    int updateByPrimaryKey(Robe record);

    List<Robe> selectAll();
}