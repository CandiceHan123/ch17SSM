package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Purchasething;
import cn.edu.ujn.ch17.dao.PurchasethingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseServiceImpl implements IPurchaseService{

    @Autowired
    private PurchasethingMapper purchasethingMapper;
    @Override
    public int addPurchaseRecord(Purchasething record) {
        return this.purchasethingMapper.insertSelective(record);
    }

    @Override
    public List<Purchasething> findById(int id) {
        return this.purchasethingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modifyReturn(Purchasething record) {
        return this.purchasethingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Purchasething> selectAll() {
        return this.purchasethingMapper.selectAll();
    }
}
