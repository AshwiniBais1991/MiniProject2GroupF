package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration {
	
public void getUserRegistrationdetails() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String firstName = scanner.next();
		System.out.println("Enter your Last Name ");
		String lastName=scanner.next();
		System.out.println("Enter Username");
		String userName = scanner.next();
		System.out.println("Enter password");
		String userpassword = scanner.next();
		System.out.println("Enter your City");
		String city = scanner.next();
		System.out.println("Enter Your mailId");
		String mailId = scanner.next();
		System.out.println("Enter Your Mobile number");
		String mobileNumber= scanner.next();
		QueriesForTable queriesForTable = new QueriesForTable();
		queriesForTable.setDataIntoRegistereduserdetailTable(firstName, lastName, userName, userpassword, city, mailId, mobileNumber );
}

}
