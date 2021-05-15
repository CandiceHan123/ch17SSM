package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Privatetrainer;
import cn.edu.ujn.ch17.dao.PrivatetrainerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PrivateTrainerImpl implements IPrivateTrainerService {

    @Autowired
    private PrivatetrainerMapper privatetrainerMapper;
    @Override
    public List<Privatetrainer> showAllTeachers() {
        return this.privatetrainerMapper.selectAll();
    }

    @Override
    public Privatetrainer findById(String id) {
        return this.privatetrainerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Privatetrainer> findByName(String name) {
        return this.privatetrainerMapper.selectByName(name);
    }

    @Override
    public List<Privatetrainer> findByLevel(int level) {
        return this.privatetrainerMapper.selectByLevel(level);
    }

    @Override
    public List<Privatetrainer> findBySex(String sex) {
        return this.privatetrainerMapper.selectBySex(sex);
    }

    @Override
    public int modifyById(Privatetrainer record) {
        return this.privatetrainerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(String id) {
        return this.privatetrainerMapper.deleteByPrimaryKey(id);
    }
}
