package com.cg.creditcard.service;

import com.cg.creditcard.entity.Login;

public interface ILoginService {
	public void signIn(int userid);
	public void changePassword(int userid, Login user);
}
