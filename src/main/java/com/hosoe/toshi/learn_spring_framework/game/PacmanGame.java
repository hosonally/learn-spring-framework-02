package com.hosoe.toshi.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component("pacman")
public class PacmanGame implements GamingConsole {
	public void up() {
		System.out.println("上にパクパク");
	}
	public void down() {
		System.out.println("下にパクパク");
	}
	public void left() {
		System.out.println("左にパクパク");
	}
	public void right() {
		System.out.println("右にパクパク");
	}
}
