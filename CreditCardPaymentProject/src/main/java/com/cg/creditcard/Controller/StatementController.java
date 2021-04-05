package com.cg.creditcard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.entity.Statement;
import com.cg.creditcard.service.StatementService;

@RestController
@RequestMapping("/statement")
public class StatementController {
	@Autowired
	StatementService statementService;
	
	@GetMapping("/byid")
	public ResponseEntity<Statement>getStatementbyId(@RequestParam int userid)
	{
		Statement statement=statementService.getStatement(userid);
		return new ResponseEntity<Statement>(statement,HttpStatus.OK);
		
	}
	
	@GetMapping("/allstatement")
	public ResponseEntity<List<Statement>>getAllStatement(){
		List<Statement>statementList=statementService.getAllStatement();
		return new ResponseEntity<List<Statement>>(statementList,HttpStatus.OK);	
	}

}
