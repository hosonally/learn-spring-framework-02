package com.hosoe.toshi.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hosoe.toshi.learn_spring_framework.game.GameRunner;
import com.hosoe.toshi.learn_spring_framework.game.GamingConsole;

@Configuration
@ComponentScan("com.hosoe.toshi.learn_spring_framework.game")
public class GamingAppLauncherApplication {

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		}

	}
}
