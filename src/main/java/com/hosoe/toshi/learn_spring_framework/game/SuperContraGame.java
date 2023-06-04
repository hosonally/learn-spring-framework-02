package com.hosoe.toshi.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("Sit Down");
	}
	public void left() {
		System.out.println("Avoid");
	}
	public void right() {
		System.out.println("Shoot");
	}
}
