package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Account;

public interface IAccountService {
	public void addAccount(Account account);
	public void removeAccount(int accountID);
	public Account getAccount(int id);
	public void updateAccount(int id, Account account);
	public List<Account> getAllAccount();
}
