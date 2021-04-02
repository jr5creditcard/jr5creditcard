package com.cg.creditcard.Dao;

import com.cg.creditcard.entity.Login;

public interface LoginRepository {
	public Login signIn(Login user);
	public Login signOut(Login user);
	public Login changePassword(long id, Long user);
}
