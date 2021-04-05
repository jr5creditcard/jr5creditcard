package com.cg.creditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cg.creditcard.Dao.AccountRepository;

@SpringBootApplication(scanBasePackageClasses= {AccountRepository.class})
@EntityScan("com.entites")
@EnableJpaRepositories("sample.data.jpa.service")
public class CreditCardPaymentApplication{
	public static void main(String[] args) {
	SpringApplication.run(CreditCardPaymentApplication.class,args);
}
}
