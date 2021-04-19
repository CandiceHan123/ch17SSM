package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Robe;
import cn.edu.ujn.ch17.dao.RobeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class RobeServiceImpl implements IRobeService{
    @Autowired
    private RobeMapper robeMapper;
    @Override
    public List<Robe> showAllRobes() {
        return this.robeMapper.selectAll();
    }

    @Override
    public int modifyById(Robe record) {
        return this.robeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(int id) {
        return this.robeMapper.deleteByPrimaryKey(id);
    }
}
