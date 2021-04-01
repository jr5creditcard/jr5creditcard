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
	@Column
	private String accountName;
	@Column
	private double balance;
	public Account() {
		
	}
	public Account(int accountid, String accountName, double balance) {
		super();
		this.accountid = accountid;
		this.accountName = accountName;
		this.balance = balance;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
}
