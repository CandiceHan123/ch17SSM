package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Purchasething;

import java.util.List;

public interface IPurchaseService {
    public int addPurchaseRecord(Purchasething record);
    public List<Purchasething> findById(int id);
    public int modifyReturn(Purchasething record);
    public List<Purchasething> selectAll();
}
