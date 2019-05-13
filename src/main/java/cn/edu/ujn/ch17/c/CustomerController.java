package cn.edu.ujn.ch17.c;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.ujn.ch17.dao.Customer;
import cn.edu.ujn.ch17.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	@RequestMapping("/findById")
	public String findCustomerById(int id,Model model) {
		Customer findCustomerById = customerService.findCustomerById(id);
		model.addAttribute("customer", findCustomerById);
		return "customer";
	}
	@RequestMapping(value="/addCustomer",method=RequestMethod.GET)
	public String toAdd() {
		return "addCustomer";
	}
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public String addCustomer(Customer  c) {
		int insert = customerService.insert(c);
		return "addCustomer";
	}
	
	@RequestMapping("/selectAll")
	public String selectAll(Model model) {
		List<Customer> selectAll = customerService.selectAll();
		model.addAttribute("list",selectAll);
		return "listCustomer";
	}
	
}















