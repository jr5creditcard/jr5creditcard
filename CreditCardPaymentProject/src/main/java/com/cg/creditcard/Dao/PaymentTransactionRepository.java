package com.cg.creditcard.Dao;

import com.cg.creditcard.entity.PaymentTransaction;
public interface PaymentTransactionRepository {
	public PaymentTransaction addPayment(PaymentTransaction payment);
	public PaymentTransaction removePayment(long id);
	public PaymentTransaction updatePayment(long id, PaymentTransaction payment);
	public PaymentTransaction getPayment(long id);


}
