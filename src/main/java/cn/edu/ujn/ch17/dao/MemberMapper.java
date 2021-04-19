package cn.edu.ujn.ch17.dao;

import cn.edu.ujn.ch17.dao.Member;

import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(String telephone);

    int insert(Member record);

    int insertSelective(Member record);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<Member> selectAll();

    List<Member> selectByPrimaryKey(String telephone);

    List<Member> selectByName(String name);

    List<Member> selectBySex(String sex);

    List<Member> selectByLevel(int level);

    List<Member> selectByAge(int age);

    List<Member> selectByPersonalTrainer(String personalTrainer);
}