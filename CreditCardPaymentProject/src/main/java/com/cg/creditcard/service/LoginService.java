package com.cg.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.creditcard.Dao.LoginRepository;
import com.cg.creditcard.entity.Login;
public class LoginService implements ILoginService{
@Autowired
LoginRepository repository;
@Override
public Login  signIn(int userid) {
	repository.findById(userid);
	return null;
	
}
@Override
public void changePassword(int userid, Login user) {
	if(repository.existsById(userid))
		repository.save(user);
}
}
