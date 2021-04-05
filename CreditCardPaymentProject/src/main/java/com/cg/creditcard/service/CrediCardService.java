package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.Dao.CreditCardRepository;
import com.cg.creditcard.entity.CreditCard;

@Service
public class CrediCardService implements ICreditCardService{
	@Autowired
	CreditCardRepository creditcardRepository;
	@Override
	public void addCreditCard(CreditCard creditcard) {
		creditcardRepository.save(creditcard);
	}

	@Override
	public void updateCreditCard(long cardNumber, CreditCard creditcard) {
       if(creditcardRepository.existsById(cardNumber))
	    creditcardRepository.save(creditcard);
		
	}

	@Override
	public List<CreditCard> getAllCreditCard() {
		
		return creditcardRepository.findAll();
	}

	@Override
	public void removeCreditCard(long cardNumber) {
		creditcardRepository.delete(creditcardRepository.findById(cardNumber).get());	
	}
	@Override
	public CreditCard getCreditCardById(long cardNumber) {
		return creditcardRepository.findById(cardNumber).orElse(null);
	}
}
