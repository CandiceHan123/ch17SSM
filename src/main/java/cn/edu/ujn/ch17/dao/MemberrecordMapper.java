package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Memberrecord;

import java.util.List;

public interface MemberrecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Memberrecord record);

    int insertSelective(Memberrecord record);

    Memberrecord selectByPrimaryKey(Integer id);

    List<Memberrecord> selectByTele(String telephone);

    List<Memberrecord> selectAll();

    int updateByPrimaryKeySelective(Memberrecord record);

    int updateByPrimaryKey(Memberrecord record);
}