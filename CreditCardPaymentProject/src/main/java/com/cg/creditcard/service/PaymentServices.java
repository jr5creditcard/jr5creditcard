package com.cg.creditcard.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.creditcard.Dao.PaymentTransactionRepository;
import com.cg.creditcard.entity.PaymentTransaction;

public class PaymentServices implements IPaymentService{
	@Autowired
	PaymentTransactionRepository repository;

	@Override
	public void addPayment(PaymentTransaction ptransaction) {
			repository.save(ptransaction);
	}

	@Override
	public void deletePayment(int id) {
		if(repository.existsById(id));
			repository.deleteById(id);
	}

	@Override
	public PaymentTransaction getPayment(int id) {
		return  repository.findById(id).orElse(null);
	}

	@Override
	public void updatePayment(int id, PaymentTransaction ptransaction) {
		if(repository.existsById(id))
			repository.save(ptransaction);
	}

	@Override
	public List<PaymentTransaction> getAllPayments() {
		return repository.findAll();
	}

}