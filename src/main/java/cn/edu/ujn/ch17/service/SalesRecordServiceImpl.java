package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Salesrecord;
import cn.edu.ujn.ch17.dao.SalesrecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
@Transactional
public class SalesRecordServiceImpl implements ISalesRecordService{

    @Autowired
    private SalesrecordMapper salesrecordMapper;
    @Override
    public List<Salesrecord> selectAll() {
        return this.salesrecordMapper.selectAll();
    }

    @Override
    public List<Salesrecord> selectByTele(String telephone) {
        return this.salesrecordMapper.selectByTele(telephone);
    }

    @Override
    public List<Salesrecord> selectByName(String name) {
        return this.salesrecordMapper.selectByThingsName(name);
    }

    @Override
    public List<Salesrecord> selectByMonth(String time1, String time2) {
        return this.salesrecordMapper.selectByMonth(time1,time2);
    }

    @Override
    public int addSalesRecord(Salesrecord record) {
        return this.salesrecordMapper.insertSelective(record);
    }

    @Override
    public int deleteSalesRecord(int id) {
        return this.salesrecordMapper.deleteByPrimaryKey(id);
    }

}
