package com.duffyLearning.in28minutes1.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.duffyLearning.in28minutes1.game.GameRunner;

@Configuration
@ComponentScan
public class DepInjectionLauncher {
	

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(DepInjectionLauncher.class)) {
			
			context.getBean(GameRunner.class).run();
		
		}
		
	}
}
