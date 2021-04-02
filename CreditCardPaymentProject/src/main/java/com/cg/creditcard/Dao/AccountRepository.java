package com.cg.creditcard.Dao;

import java.util.List;
import com.cg.creditcard.entity.Account;
public interface AccountRepository {
	public Account addAccount(Account account);
	public Account removeAccount(long id);
	public Account updateAccount(long id, Account account);
	public Account getAccount(long id);
	public List<Account> getAllAccounts();

}
