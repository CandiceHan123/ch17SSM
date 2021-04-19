package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Thing;
import cn.edu.ujn.ch17.dao.ThingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ThingServiceImpl implements IThingService{
    @Autowired
    private ThingMapper thingMapper;

    @Override
    public List<Thing> showAllThings() {
        return this.thingMapper.selectAll();
    }

    @Override
    public int modifyThings(Thing record) {
        return this.thingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteThings(String name) {
        return this.thingMapper.deleteByPrimaryKey(name);
    }
}
