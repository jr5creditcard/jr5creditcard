package com.cg.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Login")
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	@Column
	private String password;
	@OneToOne
	@JoinColumn(name="userid")
	private Customer customer;
	public Login() {
	}
	public Login(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}


