package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Statement;
public interface IStatementService {
	public void addStatement(Statement statement);
	public void removeStatement(long id);
	public Statement getStatement(long id);
	public void updateStatement(long id, Statement statement);
	public List<Statement> getAllStatement();
}
