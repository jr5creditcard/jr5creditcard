package com.cg.creditcard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.service.CustomerService;


@RestController
@RequestMapping("/Customer")
public class CustomerController {

		@Autowired
		CustomerService custServices;
			
		@PostMapping("/addCustomer")
			public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
				custServices.addCustomer(customer);
				return new ResponseEntity<String>("Account inserted",HttpStatus.OK);
				}
			
			@DeleteMapping("/deleteCustomer/{id}")
			public ResponseEntity<String> removeCustomer(@PathVariable int id) {
				custServices.removeCustomer(id);
				return new ResponseEntity<String>("Deleted", HttpStatus.OK);
			}
			
			@GetMapping("/getCustomer/{id}")
			public ResponseEntity<Customer> getCustomer(@PathVariable int id) {
				Customer customer = custServices.getCustomer(id);
				return new ResponseEntity<Customer>(customer, HttpStatus.OK);
			}
			
			@PutMapping("/updateCustomer/{id}")
			public ResponseEntity<String> updateCustomer(@RequestBody Customer customer,@PathVariable int id) {
				custServices.updateCustomer(id, customer);
				return new ResponseEntity<String>("Successfully updated", HttpStatus.OK); 
			}
			@GetMapping("/selectAll")
			public ResponseEntity<List<Customer>> getAllCustomer(){
				List<Customer> payList = custServices.getAllCustomer();
				return new ResponseEntity<List<Customer>>(payList, HttpStatus.OK);
			}
	}

