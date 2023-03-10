package com.duffyLearning.in28minutes1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("shoot");
	}
	public void down() {
		System.out.println("duck");
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("go forward");
	}
}
