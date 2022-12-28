package com.duffyLearning.in28minutes1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.duffyLearning.in28minutes1.game.GameRunner;
import com.duffyLearning.in28minutes1.game.GamingConsole;
import com.duffyLearning.in28minutes1.game.MarioGame;
import com.duffyLearning.in28minutes1.game.PacManGame;
import com.duffyLearning.in28minutes1.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	};
	
	@Bean
	public MarioGame marioGame() {
		return new MarioGame();
	}
	
	@Bean
	@Primary
	public SuperContraGame superContraGame() {
		return new SuperContraGame();
	}
	
	@Bean
	public PacManGame pacManGame() {
		return new PacManGame();
	}
}
