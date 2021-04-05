package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.Dao.StatementRepository;
import com.cg.creditcard.entity.Statement;

@Service
public class StatementService implements IStatementService{

	@Autowired
	StatementRepository statementdao;

	@Override
	public Statement getStatement(int userid) {
		return statementdao.getStatementbyId(userid);
		
	}

	@Override
	public List<Statement> getAllStatement() {
		List<Statement>statementList=statementdao.findAll();
		return statementList;
	}

}
