package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ViewCart {
	
	public void viewCartDetailforLoggedInUser() throws SQLException {
		
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
			System.out.println("Product Items has been added to cart ");
			System.out.println("Do you want to veiw your cart (yes/no)");
			String userAns = scanner.next();
			if(userAns.equals("yes")) {
			List<CartData>  listcart= queriesForTable. getDataFromCartdetailTable(user.getUserid()); 
			for(CartData cartdata : listcart) {
				System.out.println("User id >> "+ cartdata.getUserid());
				System.out.println("User name >>" + cartdata.getUsername());
				System.out.println("Product id >> " +cartdata.getProductid());
				System.out.println("Product name >> "+ cartdata.getProductname());
				System.out.println("Product description >> "+ cartdata.getDescriptions());
				System.out.println("Product quantity >>"+ cartdata.getQuantity());
				System.out.println("Product price per head >> " + cartdata.getPrice());
			}
			
		}
		
		
		
	}
	}

}
