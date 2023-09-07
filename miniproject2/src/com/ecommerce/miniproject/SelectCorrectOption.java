package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class SelectCorrectOption {
	public void doCorrectOperation() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice  = scanner.nextInt();
		switch(choice) {
		
		case 1:
			UserRegistration userRegistration = new UserRegistration();
			userRegistration.getUserRegistrationdetails();
			break;
			
		case 2 :
			LoginToApplication loginToApplication = new LoginToApplication();
			loginToApplication.gerUserNameAndPasswordForLogin();
			break;
			
		case 3 :
			ViewProductDetail viewProductDetail = new ViewProductDetail();
			viewProductDetail.getProductDetail();
			break;
		
		case 4 :
			BuyProduct buyProduct = new BuyProduct();
			buyProduct.buyProducts();
			break;
		
		case 5 :
			ViewCart viewCart = new ViewCart();
			viewCart.viewCartDetailforLoggedInUser();
			break;
			
		case 6 :
			PurchaseTheItem purchaseTheItem = new PurchaseTheItem();
			purchaseTheItem.purchaseTheItem();
			break;
			
		case 7 :
			AddProducts addProducts = new AddProducts();
			addProducts.addProductInProductDetailTable();
			break;
		
	 	case 8 :
	 		System.out.println("Admin will Calculate Bill");
			break;
			
		case 9 :
			QueriesForTable queriesForTable1 = new QueriesForTable();
			queriesForTable1.DisplayAmmounttoEndUser();
			break;
			
		case 10 :
			CheckProductQuantity checkProductQuantity = new CheckProductQuantity();
			checkProductQuantity.getProductQuantity();
			break;
			
		case 11 :
			QueriesForTable queriesForTable = new QueriesForTable();
			queriesForTable.checkRegisteredUser();
			break;
			
		case 12 :
			CheckPerticularUserHistory checkPerticularUserHistory = new CheckPerticularUserHistory();
			checkPerticularUserHistory.getUserHistory();
			break;
			
		case 13 :
			ViewProductDetail viewProductDetail2 = new ViewProductDetail();
			viewProductDetail2.getProductDetail();
			break;
			
		case 14 :
			System.out.println("You are not register user ..... "
					+ "not able to buy product");
			break;
			
			
			
		}	
		
	}

}
