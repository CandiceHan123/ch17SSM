package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Privatetrainer;
import cn.edu.ujn.ch17.dao.PrivatetrainerExample;
import java.util.List;

public interface PrivatetrainerMapper {
    int deleteByExample(PrivatetrainerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Privatetrainer record);

    int insertSelective(Privatetrainer record);

    List<Privatetrainer> selectByExample(PrivatetrainerExample example);

    Privatetrainer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Privatetrainer record);

    int updateByPrimaryKey(Privatetrainer record);

    List<Privatetrainer> selectAll();

    List<Privatetrainer> selectByName(String name);

    List<Privatetrainer> selectByLevel(int level);

    List<Privatetrainer> selectBySex(String sex);
}