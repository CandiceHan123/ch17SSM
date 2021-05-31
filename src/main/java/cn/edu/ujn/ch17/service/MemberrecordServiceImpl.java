package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Memberrecord;
import cn.edu.ujn.ch17.dao.MemberrecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberrecordServiceImpl implements IMemberrecordService {
    @Autowired
    private MemberrecordMapper mrm;

    @Override
    public List<Memberrecord> findByTele(String telephone) {
        return this.mrm.selectByTele(telephone);
    }

    @Override
    public List<Memberrecord> findAll() {
        return this.mrm.selectAll();
    }

    @Override
    public int addRecord(Memberrecord record) {
        return this.mrm.insertSelective(record);
    }

    @Override
    public int deleteRecord(int id) {
        return this.mrm.deleteByPrimaryKey(id);
    }

}
