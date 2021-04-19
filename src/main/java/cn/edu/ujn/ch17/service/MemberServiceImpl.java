package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Member;
import cn.edu.ujn.ch17.dao.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberServiceImpl implements IMemberService{
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<Member> selectAll() {
        return this.memberMapper.selectAll();
    }

    @Override
    public List<Member> selectByPrimaryKey(String telephone) {
        return this.memberMapper.selectByPrimaryKey(telephone);
    }

    @Override
    public List<Member> selectByName(String name) {
        return this.memberMapper.selectByName(name);
    }

    @Override
    public List<Member> selectBySex(String sex) {
        return this.memberMapper.selectBySex(sex);
    }

    @Override
    public List<Member> selectByLevel(int level) {
        return this.memberMapper.selectByLevel(level);
    }

    @Override
    public List<Member> selectByAge(int age) {
        return this.memberMapper.selectByAge(age);
    }

    @Override
    public List<Member> selectByPersonalTrainer(String personalTrainer) {
        return this.memberMapper.selectByPersonalTrainer(personalTrainer);
    }

    @Override
    public int modifyByTele(Member record) {
        return this.memberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByTele(String telephone) {
        return this.memberMapper.deleteByPrimaryKey(telephone);
    }

}
