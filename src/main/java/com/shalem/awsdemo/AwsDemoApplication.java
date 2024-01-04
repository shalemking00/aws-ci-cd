package com.shalem.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDemoApplication {

	@GetMapping("/shalem")
	public String someMethod(){
		return "Welcome shalem to Elastic BeanStalk";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}

}
