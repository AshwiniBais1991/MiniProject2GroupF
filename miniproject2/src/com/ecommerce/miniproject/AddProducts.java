package com.ecommerce.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddProducts {
	
	public void addProductInProductDetailTable() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product name");
		String productname = scanner.nextLine();
		System.out.println("Enter product Description");
		String description = scanner.nextLine();
		System.out.println("Enter product quantity");
		int quantity = scanner.nextInt();
		System.out.println("Enter product price");
		Float price = scanner.nextFloat();
		QueriesForTable queriesForTable = new QueriesForTable();
		queriesForTable.setDataIntoProductdetailTable(productname, description, quantity, price);
		
		
			
	}				
}
