package com.duffyLearning.in28minutes1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(@Qualifier("marioGame") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game:" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
