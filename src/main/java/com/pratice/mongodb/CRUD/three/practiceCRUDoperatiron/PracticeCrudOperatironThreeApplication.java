package com.pratice.mongodb.CRUD.three.practiceCRUDoperatiron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.pratice.mongodb.CRUD.three"})
@EntityScan(basePackages= {"com.pratice.mongodb.CRUD.three"})
@SpringBootApplication
public class PracticeCrudOperatironThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeCrudOperatironThreeApplication.class, args);
	}

}
