package com.ecommerce.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LoginToApplication {
	
	public void gerUserNameAndPasswordForLogin() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String enteredusername = scanner.next();
		System.out.println("Enter Password");
		String enteredpassword = scanner.next();
		
		QueriesForTable queriesForTable = new QueriesForTable();
		RegisteredUser user = queriesForTable.getUsernameAndPasswordFromTable(enteredusername, enteredpassword);
		
		if(user.getUserid() == -1) {
			System.out.println("invalid username or password");

		}else {
			System.out.println("Login sucessfull...." );
			System.out.println("Hi");
			System.out.println(user.getUsername());
		}
		
		
		
	}
	



}
