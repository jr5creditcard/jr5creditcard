package com.cg.creditcard.service;

import com.cg.creditcard.entity.Login;

public interface LoginService {
	public Login signIn(Login user);
	public Login changePassword(int userid, Login user);

}
