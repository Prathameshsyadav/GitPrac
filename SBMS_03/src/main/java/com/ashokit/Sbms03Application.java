package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.services.UserServices;

@SpringBootApplication
public class Sbms03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(Sbms03Application.class, args);

		Boolean b = true;
		int i = 10;
		String s = "new file added";

		UserServices bean = config.getBean(UserServices.class);
		
		bean.getName(18);
	}

}
