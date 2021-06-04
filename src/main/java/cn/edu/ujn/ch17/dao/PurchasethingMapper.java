package cn.edu.ujn.ch17.dao;


import java.util.List;

public interface PurchasethingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchasething record);

    int insertSelective(Purchasething record);

    List<Purchasething> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Purchasething record);

    int updateByPrimaryKey(Purchasething record);

    List<Purchasething> selectAll();
}
