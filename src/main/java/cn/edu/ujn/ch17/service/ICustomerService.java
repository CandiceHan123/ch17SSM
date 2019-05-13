package cn.edu.ujn.ch17.service;

import java.util.List;

import cn.edu.ujn.ch17.dao.Customer;

public interface ICustomerService {
	
	public Customer findCustomerById(int id);

	int insert(Customer record);
	
	List<Customer> selectAll();
}
