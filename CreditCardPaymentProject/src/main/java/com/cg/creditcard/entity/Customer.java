package com.cg.creditcard.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	@Column(length=40)
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private String contact_no;
	@Column
	private Date dob;
	
	@ManyToMany(targetEntity = Account.class,cascade = {CascadeType.ALL})
	@JoinTable(name = "Account",joinColumns = {@JoinColumn(name="userid")},
	inverseJoinColumns = {@JoinColumn(name="accountid")})
	private List<Account>account;
	
	@OneToMany(mappedBy = "Customer",cascade = CascadeType.ALL)
	private List<CreditCard>creditcard;
	
	@OneToMany(mappedBy = "Customer",cascade = CascadeType.ALL)
	private List<Address>address;
	
	@OneToMany(mappedBy = "Customer",cascade = CascadeType.ALL)
	private List<PaymentTransaction>paymentTransaction;
	
	@OneToMany(mappedBy = "Customer",cascade = CascadeType.ALL)
    private List<Statement>statement;
	
	@OneToOne(cascade = CascadeType.ALL)
	private List<Login>login;
	
	public List<PaymentTransaction> getPaymentTransaction() {
		return paymentTransaction;
	}
	public void setPaymentTransaction(List<PaymentTransaction> paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
	}
	public List<Statement> getStatement() {
		return statement;
	}
	public void setStatement(List<Statement> statement) {
		this.statement = statement;
	}
	public List<Address> getAddress() {
		return address;
	}
	public List<CreditCard> getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(List<CreditCard> creditcard) {
		this.creditcard = creditcard;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Customer() {
	}
	public Customer(int userid, String first_name, String last_name, String email, String contact_no, Date dob) {
		super();
		this.userid = userid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.dob = dob;
		
	}
	
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Login> getLogin() {
		return login;
	}
	public void setLogin(List<Login> login) {
		this.login = login;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no=contact_no;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}