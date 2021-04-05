package com.cg.creditcard.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.creditcard.entity.Statement;
@Repository
public interface StatementRepository extends JpaRepository<Statement,Integer> {	
	@Query(value = "from customer where customer.userid=?1")
	public Statement getStatementbyId(int userid);

}
