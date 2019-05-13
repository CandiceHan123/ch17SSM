package cn.edu.ujn.ch17.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.ujn.ch17.dao.Customer;
import cn.edu.ujn.ch17.dao.CustomerDao;
import cn.edu.ujn.ch17.dao.CustomerMapper;
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Override
	public int insert(Customer record) {
		// TODO Auto-generated method stub
		int insert = customerMapper.insert(record);
		System.out.println(insert);
		return insert;
	}

	@Override
	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
		List<Customer> selectAll = customerMapper.selectAll();
		return selectAll;
	}

}



















