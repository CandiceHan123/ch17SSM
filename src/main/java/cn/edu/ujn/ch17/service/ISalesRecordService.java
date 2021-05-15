package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Salesrecord;

import java.sql.Timestamp;
import java.util.List;

public interface ISalesRecordService {
    public List<Salesrecord> selectAll();

    public List<Salesrecord> selectByTele(String telephone);

    public List<Salesrecord> selectByName(String name);

    public List<Salesrecord> selectByMonth(String time1,String time2);

    public int addSalesRecord(Salesrecord record);
}
