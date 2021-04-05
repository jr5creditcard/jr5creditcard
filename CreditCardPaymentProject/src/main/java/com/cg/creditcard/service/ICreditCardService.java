package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.CreditCard;

public interface ICreditCardService {
	public void addCreditCard(CreditCard creditcard);
	public void removeCreditCard(long cardNumber);
	public void updateCreditCard(long cardNumber,CreditCard creditcard);
	public CreditCard getCreditCardById(long cardNumber);
	public List<CreditCard> getAllCreditCard();
}
