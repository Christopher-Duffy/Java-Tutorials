package com.duffyLearning.in28minutes1.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("go down pipe");
	}
	public void left() {
		System.out.println("stop");
	}
	public void right() {
		System.out.println("Go faster");
	}
}
