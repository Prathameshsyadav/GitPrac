package com.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("MongoDB")
public class MongoDB implements UserDao {

	public MongoDB() {
		System.out.println("Mongo No param constructor called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void findUserById(int id) {
		System.out.println("MongoDB inserted");
		if (id == 26) {
			System.out.println("Prathamesh");
		} else if (id == 18) {
			System.out.println("Virat Kohli");
		}

	}

}
