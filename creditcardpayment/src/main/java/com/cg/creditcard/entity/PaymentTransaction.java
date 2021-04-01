package com.cg.creditcard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PaymentTransaction")
public class PaymentTransaction {
	@Id
	private int tranaction_id;
	@Column
	private long cardNumber;
	@Column
	private Date transaction_date;
	@Column
	private String Status;
	@Column
	private double amount;
	public PaymentTransaction() {
		
	}
	public PaymentTransaction(int tranaction_id, long cardNumber, Date transaction_date, String status, double amount) {
		super();
		this.tranaction_id = tranaction_id;
		this.cardNumber = cardNumber;
		this.transaction_date = transaction_date;
		Status = status;
		this.amount = amount;
	}
	public int getTranaction_id() {
		return tranaction_id;
	}
	public void setTranaction_id(int tranaction_id) {
		this.tranaction_id = tranaction_id;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
