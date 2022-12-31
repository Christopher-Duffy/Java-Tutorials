package com.duffyLearning.in28minutes1.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("someClass has been created");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("clean up");
	}
}

@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("some logic using someDependency");
	}
	
}
@Configuration
@ComponentScan
public class PrePostAnnotations {
	

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(PrePostAnnotations.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}
		
	}
}
