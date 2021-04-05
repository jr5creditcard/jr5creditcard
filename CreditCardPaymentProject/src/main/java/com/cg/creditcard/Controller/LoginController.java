package com.cg.creditcard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.creditcard.entity.Login;
import com.cg.creditcard.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
@Autowired
LoginService service;

@GetMapping("/getuserbyuserid")
public ResponseEntity<String> signIn(@RequestBody int userid){
	service.signIn(userid);
	return new ResponseEntity<String>("Login Successful",HttpStatus.OK);
}
@PutMapping("/changePassword/{userid}")
public ResponseEntity<String> updatePayment(@RequestBody Login user,@PathVariable int userid) {
	service.changePassword(userid, user);
	return new ResponseEntity<String>("Successfully updated", HttpStatus.OK); 	
}

}
