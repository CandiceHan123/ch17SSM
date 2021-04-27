package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Motion;
import cn.edu.ujn.ch17.dao.MotionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MotionServiceImpl implements IMotionService{

    @Autowired
    public MotionMapper motionMapper;
    @Override
    public Motion findByTele(String telephone) {
        return this.motionMapper.selectByPrimaryKey(telephone);
    }
}
