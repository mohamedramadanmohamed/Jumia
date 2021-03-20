package com.jumia.ass.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jumia.ass.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
