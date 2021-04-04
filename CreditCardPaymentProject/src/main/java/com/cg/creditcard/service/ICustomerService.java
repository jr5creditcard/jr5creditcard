package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Customer;

public interface ICustomerService {
	public void addCustomer(Customer customer);
	public void removeCustomer(int id);
	public Customer getCustomer(int id);
	public void updateCustomer(int id, Customer customer);
	public List<Customer> getAllCustomer();
}
