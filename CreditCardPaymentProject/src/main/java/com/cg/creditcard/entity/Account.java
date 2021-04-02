package com.cg.creditcard.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	private int accountid;
	@Column(length = 30)
	private String account_name;
	@Column
	private double balance;
	public Account() {
		
	}
	public Account(int accountid, String account_name, double balance) {
		super();
		this.accountid = accountid;
		this.account_name = account_name;
		this.balance = balance;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountName() {
		return account_name;
	}
	public void setAccountName(String account_name) {
		this.account_name = account_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
