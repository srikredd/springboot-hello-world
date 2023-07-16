//package com.example.application;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringbootAppApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootAppApplication.class, args);
//	}
//
//}

package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
	}

	@RestController
	public class HelloWorldController {

	    @GetMapping("/hello")
	    public String helloWorld() {
	        return "Hello, World!";
	    }
	}
}
