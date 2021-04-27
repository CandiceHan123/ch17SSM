package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Member;

import java.util.List;

public interface IMemberService {
    public List<Member> selectAll();
    public Member selectByPrimaryKey(String telephone);
    public List<Member> selectByName(String name);
    public List<Member> selectBySex(String sex);
    public List<Member> selectByLevel(int level);
    public List<Member> selectByAge(int age);
    public List<Member> selectByPersonalTrainer(String personalTrainer);
    public int modifyByTele(Member record);
    public int deleteByTele(String telephone);
}
