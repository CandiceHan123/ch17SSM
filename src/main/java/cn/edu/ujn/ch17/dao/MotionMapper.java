package cn.edu.ujn.ch17.dao;

public interface MotionMapper {
    int deleteByPrimaryKey(String telephone);

    int insert(Motion record);

    int insertSelective(Motion record);

    Motion selectByPrimaryKey(String telephone);

    int updateByPrimaryKeySelective(Motion record);

    int updateByPrimaryKey(Motion record);
}
