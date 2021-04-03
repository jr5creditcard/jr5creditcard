package com.cg.creditcard.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcard.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer>{
	
}
