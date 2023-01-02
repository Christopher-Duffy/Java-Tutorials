package com.duffyLearning.in28minutes1.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.duffyLearning.in28minutes1.game.GameRunner;

public class XMLConfigContext {
	

	public static void main(String[] args) {
		
		try(var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("game"));
			context.getBean(GameRunner.class).run();
		}
		
	}
}
