package com.cg.creditcard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "PaymentTransaction")
public class PaymentTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tranaction_id;
	@Column(length=30)
	private long card_number;
	@Column
	private Date transaction_date;
	@Column
	private String status;
	@Column
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private Customer customer;
	
	public PaymentTransaction() {
		
	}
	public PaymentTransaction(int tranaction_id, long card_number, Date transaction_date, String status, double amount,Customer customer) {
		super();
		this.tranaction_id = tranaction_id;
		this.card_number = card_number;
		this.transaction_date = transaction_date;
		this.status = status;
		this.amount = amount;
		this.customer=customer;
	}
	public int getTranaction_id() {
		return tranaction_id;
	}
	public void setTranaction_id(int tranaction_id) {
		this.tranaction_id = tranaction_id;
	}
	public long getCard_number() {
		return card_number;
	}
	public void setCardNumber(long card_number) {
		this.card_number = card_number;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
