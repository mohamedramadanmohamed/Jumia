package com.jumia.ass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jumia.ass.dtos.Response;
import com.jumia.ass.entities.Customer;
import com.jumia.ass.service.CustomerService;
import com.jumia.ass.utils.PhoneNumbersUtils;

/**
 * @author MohamedRamadan
 *
 */
@Controller
@RequestMapping("/api/v1")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer") 
	public String getAllCustomers(ModelMap modelMap){
		List<Customer> custromers= customerService.getCustomersList();
		List<Response> response= PhoneNumbersUtils.extractPhoneNumbersInfo(custromers);
		modelMap.put("records", response);
		System.out.println(modelMap);
		return "customers";
	}
	
	
}
