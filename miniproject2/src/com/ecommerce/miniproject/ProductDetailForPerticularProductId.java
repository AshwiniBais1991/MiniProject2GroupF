package com.ecommerce.miniproject;

public class ProductDetailForPerticularProductId {
	private int productid;
	private String productname;
	private String descriptions;
	private int quantity;
	private Float price;
	public ProductDetailForPerticularProductId(int productid,String productname, String descriptions, int quantity, Float price) {
		this.productid = productid;
		this.productname = productname;
		this.descriptions = descriptions;
		this.quantity = quantity;
		this.price = price;
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
}
