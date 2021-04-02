package com.cg.creditcard.Dao;

import java.util.List;
import com.cg.creditcard.entity.Customer;
public interface CustomerRepository {
	public Customer addCustomer(Customer customer);
	public Customer removeCustomer(long custId);
	public Customer updateCustomer(long custId, Customer customer);
	public Customer getCustomer(long custId);
	public List<Customer> getAllCustomers(); 

}
