package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class PurchaseTheItem {
	public void purchaseTheItem() throws SQLException {
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
			System.out.println(); 
			System.out.println("Your bill is ");
			float sum = queriesForTable.calculateBill(user.getUsername(),user.getUserid());
			System.out.println("User Name >> " + user.getUsername());
			System.out.println("Total Price is >> "+ sum);
			
		}
		
		
		
	}

}
