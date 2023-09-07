package com.ecommerce.miniproject;

import java.sql.SQLException;
import java.util.List;

public class ProductDetail {
	private int productid;
	private String productname;
	private String descriptions;
	private int quantity;
	private float price;
	
	ProductDetail() {
		
	}
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	public ProductDetail(int productid, String productname, String descriptions, int quantity, float  price) {
		this.productid = productid;
		this.productname = productname;
		this.descriptions = descriptions;;
		this.quantity = quantity;
		this.price = price;
		
	}
		
	

	
}
