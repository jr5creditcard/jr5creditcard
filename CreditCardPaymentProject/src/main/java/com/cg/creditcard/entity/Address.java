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
@Table(name = "Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String door_no;
	@Column
	private String street;
	@Column
	private String area;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	public Address() {
	}
	public Address(String door_no, String street, String area, String city, String state, int pincode) {
		super();
		this.door_no = door_no;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private Customer customer;
	
	
	public String getDoor_no() {
		return door_no;
	}
	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}