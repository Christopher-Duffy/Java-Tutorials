package com.duffyLearning.in28minutes1.game;

public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("eat ghost");
	}
	public void down() {
		System.out.println("eat fruit");
	}
	public void left() {
		System.out.println("go tunnel");
	}
	public void right() {
		System.out.println("move around pac man");
	}
}
