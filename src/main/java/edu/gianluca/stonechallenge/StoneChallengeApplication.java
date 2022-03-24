package edu.gianluca.stonechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StoneChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoneChallengeApplication.class, args);
	}

}
