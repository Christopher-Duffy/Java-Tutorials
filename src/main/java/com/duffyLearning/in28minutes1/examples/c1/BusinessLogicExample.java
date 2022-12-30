package com.duffyLearning.in28minutes1.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessLogicExample {
	

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(BusinessLogicExample.class)) {
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
		
	}
}
