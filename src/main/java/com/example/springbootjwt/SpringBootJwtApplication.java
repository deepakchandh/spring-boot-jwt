package com.example.springbootjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// https://www.javainuse.com/spring/boot-jwt
@SpringBootApplication
public class SpringBootJwtApplication {

	public static void main(String... args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

//	@RestController
//	public class HelloWorldController {
//
//		@RequestMapping("/hello")
//		public String firstPage() {
//			return "Hello World";
//		}
//
//	}

}
