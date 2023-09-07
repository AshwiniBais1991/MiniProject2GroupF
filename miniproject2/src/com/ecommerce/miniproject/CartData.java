package com.ecommerce.miniproject;

public class CartData {
	private int cartid;
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	private int orderid;
	private int userid;
	private String username;
	private int productid;
	private String productname;
	private String descriptions;
	private int quantity;
	private float price;
	public CartData(int cartid ,int orderid, int userid, String username, int productid, String productname, String descriptions,
					int quantity, float price) {
		
		this.cartid = cartid;
		this.orderid = orderid;
		this.userid = userid;
		this.username = username;
		this.productid = productid;
		this.productname = productname;
		this.descriptions = descriptions;
		this.quantity = quantity;
		this.price = price;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	

}
