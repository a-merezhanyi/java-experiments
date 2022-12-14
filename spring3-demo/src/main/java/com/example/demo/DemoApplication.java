package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(TeamMateRepository repository) {
		return args -> {
			repository.save(new TeamMate("Doctor", "wizard,heal"));
			repository.save(new TeamMate("Wanda", "sword,fight"));
		};
	}

}
