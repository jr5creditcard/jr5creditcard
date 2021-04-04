package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.PaymentTransaction;

public interface IPaymentService {
	public void addPayment(PaymentTransaction ptransaction);
	public void deletePayment(int id);
	public PaymentTransaction getPayment(int id); 
	public void updatePayment(int id, PaymentTransaction ptransaction);
	public List<PaymentTransaction> getAllPayments();
	
}