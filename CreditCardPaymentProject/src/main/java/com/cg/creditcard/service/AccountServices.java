package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.Dao.AccountRepository;
import com.cg.creditcard.entity.Account;


@Service
public class AccountServices implements IAccountService{
	@Autowired
	AccountRepository repository;

	@Override
	public void addAccount(Account account) {
		repository.save(account);
		
	}

	@Override
	public void removeAccount(int accountID) {
		if(repository.existsById(accountID));
		repository.deleteById(accountID);
		
	}

	@Override
	public Account getAccount(int id) {
		return  repository.findById(id).orElse(null);
	}

	@Override
	public void updateAccount(int id, Account account) {
		if(repository.existsById(id))
			repository.save(account);
		
	}

	@Override
	public List<Account> getAllAccount() {
		return repository.findAll();
	}

}
