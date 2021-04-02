package com.cg.creditcard.Dao;

import java.util.List;
import com.cg.creditcard.entity.CreditCard;
public interface CreditCardRepository {
	public CreditCard addCreditCard(CreditCard creditCard);
	public CreditCard removeCreditCard(long cardId);
	public CreditCard updateCreditCard(long cardId, CreditCard card);
	public CreditCard getCreditCard(long cardId);
	public List<CreditCard> getAllCreditCards(); 
}
