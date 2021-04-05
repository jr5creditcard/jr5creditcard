package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.Dao.CustomerRepository;
import com.cg.creditcard.entity.Customer;
@Service
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepository repository;
	
	@Override
	public void addCustomer(Customer customer) {
		repository.save(customer);
	}

	@Override
	public void removeCustomer(int id) {
		if(repository.existsById(id));
		repository.deleteById(id);
	}

	@Override
	public Customer getCustomer(int id) {
		return  repository.findById(id).orElse(null);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		if(repository.existsById(id))
			repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return repository.findAll();
	}

}
