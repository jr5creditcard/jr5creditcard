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

import com.cg.creditcard.entity.Account;
import com.cg.creditcard.service.AccountServices;


@RestController
@RequestMapping("/Account")
public class AccountController {
		@Autowired
		AccountServices accServices;
		
		@PostMapping("/addAccount")
		public ResponseEntity<String> addAccount(@RequestBody Account account) {
			accServices.addAccount(account);
			return new ResponseEntity<String>("Account inserted",HttpStatus.OK);
			}
		
		@DeleteMapping("/deleteAccount/{id}")
		public ResponseEntity<String> removeAccount(@PathVariable int id) {
			accServices.removeAccount(id);
			return new ResponseEntity<String>("Deleted", HttpStatus.OK);
		}
		
		@GetMapping("/getAccount/{id}")
		public ResponseEntity<Account> getAccount(@PathVariable int id) {
			Account account = accServices.getAccount(id);
			return new ResponseEntity<Account>(account, HttpStatus.OK);
		}
		
		@PutMapping("/updateAccount/{id}")
		public ResponseEntity<String> updateAccount(@RequestBody Account account,@PathVariable int id) {
			accServices.updateAccount(id, account);
			return new ResponseEntity<String>("Successfully updated", HttpStatus.OK); 
		}
		@GetMapping("/selectAll")
		public ResponseEntity<List<Account>> getAllAccount(){
			List<Account> payList = accServices.getAllAccount();
			return new ResponseEntity<List<Account>>(payList, HttpStatus.OK);
		}
	}
