package com.cg.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CreditCard")
public class CreditCard {
	@Id
	private long cardNumber;
	@Column
	private String cardName;
	@Column
	private int expriryDate;
	@Column
	private long AmountLimit;
	public CreditCard() {
		
	}
	public CreditCard(long cardNumber, String cardName, int expriryDate, long amountLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.expriryDate = expriryDate;
		AmountLimit = amountLimit;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getExpriryDate() {
		return expriryDate;
	}
	public void setExpriryDate(int expriryDate) {
		this.expriryDate = expriryDate;
	}
	public long getAmountLimit() {
		return AmountLimit;
	}
	public void setAmountLimit(long amountLimit) {
		AmountLimit = amountLimit;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardName=" + cardName + ", expriryDate=" + expriryDate
				+ ", AmountLimit=" + AmountLimit + "]";
	}
}
