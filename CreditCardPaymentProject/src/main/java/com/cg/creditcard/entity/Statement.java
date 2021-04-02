package com.cg.creditcard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Statement")
public class Statement {
	@Id
	private double due_amount;
	@Column
	private Date billing_date;
	@Column
	private Date due_date;
	
	@ManyToOne 
	@JoinColumn(name="userid")
	private Customer customer;
	public Statement() {
		
	}
	public Statement(double due_amount, Date billing_date, Date due_date) {
		super();
		this.due_amount = due_amount;
		this.billing_date = billing_date;
		this.due_date = due_date;
	}
	public double getDue_amount() {
		return due_amount;
	}
	public void setDue_amount(double due_amount) {
		this.due_amount = due_amount;
	}
	public Date getBilling_date() {
		return billing_date;
	}
	public void setBilling_date(Date billing_date) {
		this.billing_date = billing_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
