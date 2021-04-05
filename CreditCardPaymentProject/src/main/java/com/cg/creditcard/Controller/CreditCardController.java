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

import com.cg.creditcard.entity.CreditCard;
import com.cg.creditcard.service.CrediCardService;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {

	@Autowired
	CrediCardService service;
		
		@PostMapping
		public ResponseEntity<String> addCreditCard(@RequestBody CreditCard creditcard)
		{
			service.addCreditCard(creditcard);
			return new ResponseEntity<>("CreditCard added",HttpStatus.OK);
		}
		@DeleteMapping("/{number}")
		public ResponseEntity<String> deleteCreditCard(@PathVariable("number")Long number)
		{
			service.removeCreditCard(number);
			return new ResponseEntity<String>("card deleted..",HttpStatus.OK);
		}
		@PutMapping("/updateCreditCard/{number}")
		public ResponseEntity<String> updateCreditCard(@RequestBody CreditCard creditcard,@PathVariable long number)
		{
			service.updateCreditCard(number, creditcard);
			return new ResponseEntity<String>("Successfully updated",HttpStatus.OK);
		}
		@GetMapping("/getCreditCard/{number}")
		public ResponseEntity<CreditCard> getCreditCard(@PathVariable long number)
		{
			CreditCard creditcard=service.getCreditCardById(number);
			return new ResponseEntity<CreditCard>(creditcard,HttpStatus.OK);
		}
		@GetMapping("/getAllCreditCard")
		public ResponseEntity<List<CreditCard>> getAllCreditCard()
		{
			List<CreditCard> numberList=service.getAllCreditCard();
			return new ResponseEntity<List<CreditCard>>(numberList,HttpStatus.OK);
		}
}
