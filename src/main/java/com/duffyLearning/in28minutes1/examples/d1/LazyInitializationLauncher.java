package com.duffyLearning.in28minutes1.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization Logic for Class B Constructor");
		this.classA = classA;
	}
	
	public void doThing() {
		System.out.println("Class B doing a thing");
	};
}

@Configuration
@ComponentScan
public class LazyInitializationLauncher {
	

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncher.class)) {
			
			System.out.println("Initialization of context is complete");
			context.getBean(ClassB.class).doThing();
		}
		
	}
}
