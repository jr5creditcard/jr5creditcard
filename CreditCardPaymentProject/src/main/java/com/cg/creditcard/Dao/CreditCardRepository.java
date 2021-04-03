package com.cg.creditcard.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcard.entity.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Integer>{
	 
}
