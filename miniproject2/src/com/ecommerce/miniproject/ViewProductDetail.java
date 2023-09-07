package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.List;

public class ViewProductDetail {
	
	public void getProductDetail() {
		
		QueriesForTable queriesForTable = new QueriesForTable();
		try {
			List<ProductDetail> productdetail = queriesForTable.getDataFromProductdetailTable();
			for(ProductDetail obj : productdetail) {
				System.out.println("Product id >> " + obj.getProductid());
				System.out.println("Product name >> " + obj.getProductname());
				System.out.println("Product description >> "+ obj.getDescriptions());
				System.out.println("Available quantity >> " + obj.getQuantity());
				System.out.println("Price >> "+ obj.getPrice());
			
			}
			}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
	}


