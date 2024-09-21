package com.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OracleDB implements UserDao {

	public OracleDB() {
		System.out.println("OracleDB no param called");
	}

	@Override
	public void findUserById(int id) {
		System.out.println("Oracle DB inserted");
		if (id == 26) {
			System.out.println("Prathamesh");
		} else if (id == 18) {
			System.out.println("Virat Kohli");
		}

	}

}
