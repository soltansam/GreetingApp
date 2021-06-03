package net.javaheap.greetingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GreetingAppApplication {

	@RequestMapping("/")
	String home() {
		return "Hello, How are you?";
	}

	public static void main(String[] args) {
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
