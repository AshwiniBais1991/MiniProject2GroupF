package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CheckPerticularUserHistory {
	public void getUserHistory() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user id ");
		int userid = scanner.nextInt();
		QueriesForTable queriesForTable = new QueriesForTable();
		List<CartData> history = queriesForTable.getDataFromCartdetailTable(userid);
		for(CartData data : history) {
			System.out.println("Product id >> " + data.getProductid() );
			System.out.println("Product Name >> " + data.getProductname());
			System.out.println("Product Description >> "+ data.getDescriptions());
			System.out.println("Quantity >> " + data.getQuantity());
			System.out.println("price >> "+  data.getPrice());
			System.out.println();
			
		}
	}
}
