package com.cg.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "CreditCard")
public class CreditCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cardNumber;
	@Column(length =30)
	private String cardName;
	@Column
	private int expiryMonth;
	@Column
	private int expiryYear;
	@Column
	private double AmountLimit;
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private Customer customer;
	
	
	public CreditCard() {
		
	}
	public CreditCard(long cardNumber, String cardName, int expiryMonth,int expiryYear, double amountLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.expiryMonth=expiryMonth;
		this.expiryYear=expiryYear;
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
	
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public double getAmountLimit() {
		return AmountLimit;
	}
	public void setAmountLimit(double amountLimit) {
		AmountLimit = amountLimit;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}