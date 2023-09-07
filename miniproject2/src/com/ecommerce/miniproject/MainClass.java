package com.ecommerce.miniproject;

import java.sql.SQLException;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to E-Commerce based application");
		System.out.println("User Operation\r\n\t" + 
				"1. User Registration\r\n\t" + 
				"2. User Login\r\n\t" + 
				"3. User view Product item as Sorted Order\r\n\t" + 
				"4. Buy Product\r\n\t" + 
				"5. View Cart\r\n\t" + 
				"6. Purchase the item\r\n" + 
				"Admin Operation\r\n\t" + 
				"7. Add product item\r\n\t" + 
				"8. Calculate Bill\r\n\t" + 
				"9. Display amount to End User\r\n\t" + 
				"10.Check Quantity\r\n\t" + 
				"11. Check registered user\r\n\t" + 
				"12. Check the particular user history\r\n" + 
				"Guest Operation\r\n\t" + 
				"13. View product item\r\n\t" + 
				"14. Not purchase item\n");
		
		
		SelectCorrectOption selectCorrectOption = new SelectCorrectOption();
		try {
			selectCorrectOption.doCorrectOperation();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
