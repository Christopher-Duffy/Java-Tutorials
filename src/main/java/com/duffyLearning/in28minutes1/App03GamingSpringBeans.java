package com.duffyLearning.in28minutes1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.duffyLearning.in28minutes1.game.GameRunner;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {
			
			context.getBean(GameRunner.class).run();
		
		}
		
//		//var game = new MarioGame();
//		//var game = new SuperContraGame();
//		var game = new PacManGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	}
}
