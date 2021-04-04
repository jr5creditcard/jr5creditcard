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

import com.cg.creditcard.entity.PaymentTransaction;
import com.cg.creditcard.service.PaymentServices;

@RestController
@RequestMapping("/paymenttransaction")
public class PayementController {
	@Autowired
	PaymentServices payServices;
	
	@PostMapping("/addPayment")
	public ResponseEntity<String> addPayment(@RequestBody PaymentTransaction pTransaction) {
		payServices.addPayment(pTransaction);
		return new ResponseEntity<String>("Payment inserted",HttpStatus.OK);
		}
	
	@DeleteMapping("/deletePayment/{id}")
	public ResponseEntity<String> deletePayment(@PathVariable int id) {
		payServices.deletePayment(id);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
	
	@GetMapping("/getPayment/{id}")
	public ResponseEntity<PaymentTransaction> getPayment(@PathVariable int id) {
		PaymentTransaction pTransaction = payServices.getPayment(id);
		return new ResponseEntity<PaymentTransaction>(pTransaction, HttpStatus.OK);
	}
	
	@PutMapping("/updatePayment/{id}")
	public ResponseEntity<String> updatePayment(@RequestBody PaymentTransaction ptransaction,@PathVariable int id) {
		payServices.updatePayment(id, ptransaction);
		return new ResponseEntity<String>("Successfully updated", HttpStatus.OK); 
	}
	@GetMapping("/selectAll")
	public ResponseEntity<List<PaymentTransaction>> getAllPayment(){
		List<PaymentTransaction> payList = payServices.getAllPayments();
		return new ResponseEntity<List<PaymentTransaction>>(payList, HttpStatus.OK);
	}
}