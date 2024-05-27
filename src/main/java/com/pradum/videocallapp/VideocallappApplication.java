package com.pradum.videocallapp;

import com.pradum.videocallapp.user.User;
import com.pradum.videocallapp.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallappApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService userService
	){
		return args -> {
			userService.register(User.builder()
							.username("pradum")
							.email("pradumjaiswar790@gmail.com")
							.password("Pradum@7897")
					.build());
			userService.register(User.builder()
					.username("manish")
					.email("manishgupta60071@gmail.com")
					.password("Manish@7897")
					.build());
			userService.register(User.builder()
					.username("shreya")
					.email("shreyapandey602@gmail.com")
					.password("Shreya@7897")
					.build());
		};
	}

}
