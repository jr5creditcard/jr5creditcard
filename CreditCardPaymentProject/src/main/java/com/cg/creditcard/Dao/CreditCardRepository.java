package com.cg.creditcard.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.creditcard.entity.CreditCard;
@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Long>{

}
