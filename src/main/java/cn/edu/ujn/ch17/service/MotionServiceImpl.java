package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Memberrecord;
import cn.edu.ujn.ch17.dao.MemberrecordMapper;
import cn.edu.ujn.ch17.dao.Motion;
import cn.edu.ujn.ch17.dao.MotionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class MotionServiceImpl implements IMotionService{

    @Autowired
    public MotionMapper motionMapper;
    @Override
    public Motion findByTele(String telephone) {
        return this.motionMapper.selectByPrimaryKey(telephone);
    }

    @Override
    public int modifyDuration(Motion record) {
        return this.motionMapper.updateByPrimaryKeySelective(record);
    }
}
