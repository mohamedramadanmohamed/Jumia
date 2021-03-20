package com.jumia.ass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jumia.ass.dao.CustomerRepository;
import com.jumia.ass.entities.Customer;

/**
 * @author MohamedRamadan
 *
 */
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public List<Customer> getCustomersList() {
		return repository.findAll();
	}

	

}
