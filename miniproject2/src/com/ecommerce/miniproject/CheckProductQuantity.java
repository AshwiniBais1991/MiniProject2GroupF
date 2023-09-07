package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class CheckProductQuantity {
	public void getProductQuantity() throws SQLException {
		System.out.println("Enter product id >> ");
		Scanner scanner = new Scanner(System.in);
		int productid= scanner.nextInt();
		QueriesForTable queriesForTable = new QueriesForTable();
		ProductDetailForPerticularProductId productdetail = queriesForTable.getDataFromProcductdetailTableForPerticularProductId(productid);
		System.out.println();
		System.out.println("Product quantity is >> " + productdetail.getQuantity() );
}

}
