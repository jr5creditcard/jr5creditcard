package com.cg.creditcard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	private int userid;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String email;
	@Column
	private String contactNo;
	@Column
	private Date dob;
	public Customer() {
	}
	public Customer(int userid, String firstName, String lastName, String email, String contactNo, Date dob) {
		super();
		this.userid = userid;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.dob = dob;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Customer [userid=" + userid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
				+ ", contactNo=" + contactNo + ", dob=" + dob + "]";
	}
}
