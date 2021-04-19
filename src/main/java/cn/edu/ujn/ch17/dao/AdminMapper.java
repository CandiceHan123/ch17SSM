package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String telephone);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String telephone);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}