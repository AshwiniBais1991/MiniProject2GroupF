package com.ecommerce.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueriesForTable {
public float sum = 0;
Connection connection = null;
PreparedStatement preparedStatement  = null;
ResultSet resultSet = null;

public List<ProductDetail> getDataFromProductdetailTable() throws SQLException {
	List<ProductDetail> productList = new ArrayList<ProductDetail>();
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("select * from productdetail order by productid ");
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			productList.add(new ProductDetail(resultSet.getInt(1),resultSet.getString(2),
											resultSet.getString(3),resultSet.getInt(4),resultSet.getFloat(5)));
			
		}
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	return productList;		
}

public ProductDetailForPerticularProductId getDataFromProcductdetailTableForPerticularProductId( int productid) throws SQLException {
	ProductDetailForPerticularProductId ProductDetailForPerticularProductId = null;
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("select * from productdetail where productid = ? ");
		preparedStatement.setInt(1, productid);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			ProductDetailForPerticularProductId = new ProductDetailForPerticularProductId(resultSet.getInt(1),resultSet.getString(2),
											resultSet.getString(3),resultSet.getInt(4),resultSet.getFloat(5));
			
		}
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	return ProductDetailForPerticularProductId;		
}
	


public void setDataIntoProductdetailTable(String productname,String description, int quantity,float price ) throws SQLException {
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("insert into productdetail (productname,descriptions,quantity,price) values(?,?,?,?)");
		preparedStatement.setString(1, productname);
		preparedStatement.setString(2, description);
		preparedStatement.setInt(3, quantity);
		preparedStatement.setFloat(4, price);
		int i = preparedStatement.executeUpdate();
		System.out.println("You have Added  "+ i+ " Products");
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}	
}


public List<RegisteredUser> getDataFromRegistereduserdetailTable() throws SQLException {
	
	List<RegisteredUser> registeredUserlist = new ArrayList<RegisteredUser>();
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    Connection connection = loadDriverandCreateConnetion.getconnetion();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from registereduserdetail");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			
			registeredUserlist.add(new RegisteredUser(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),
													  resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),
													  resultSet.getString(7), resultSet.getString(8),resultSet.getInt(9)));
		}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	return registeredUserlist;		
}

/*public void viewProducts() throws SQLException {
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("select * from productdetail ");
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println("Product Id >> " +resultSet.getInt(1));
			System.out.println("Product Name >> "+ resultSet.getString(2));
			System.out.println("Product Description >> "+resultSet.getString(3));
			System.out.println("Quantity >> "+ resultSet.getInt(4) );
			System.out.println("Price >> "+resultSet.getFloat(5) );
		}
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
}*/

public void checkRegisteredUser() throws SQLException{
	
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    Connection connection = loadDriverandCreateConnetion.getconnetion();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from registereduserdetail");
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println("Username >> " + resultSet.getString("username"));
			System.out.println("First Name >> " + resultSet.getString("firstname"));
			System.out.println("Last Name >> "+ resultSet.getString("lastname"));
			System.out.println("Email Id >> "+resultSet.getString("mailid"));
			System.out.println("Mobile Number >> "+ resultSet.getString("mobilenumber"));
			System.out.println("City >> "+ resultSet.getString("city"));
			System.out.println(); 
			
		}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
			
}

public void setDataIntoRegistereduserdetailTable(String firstname, String lastname, String username, String password,String city, String mailid, String mobilenumber) throws SQLException {
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("insert into registereduserdetail (firstname, lastname,username, passwords,city ,mailid,mobilenumber ) values(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, firstname);
		preparedStatement.setString(2, lastname);
		preparedStatement.setString(3, username);
		preparedStatement.setString(4, password);
		preparedStatement.setString(5, city);
		preparedStatement.setString(6, mailid);
		preparedStatement.setString(7, mobilenumber);
		preparedStatement.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}	
}


public List<CartData> getDataFromCartdetailTable( int userid) throws SQLException {
	List<CartData> cartData = new ArrayList<CartData>();
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("select * from cartdetail where userid = ? ");
		preparedStatement.setInt(1, userid);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			cartData.add(new CartData(  resultSet.getInt(1),resultSet.getInt(2),resultSet.getInt(3),
										resultSet.getString(4),resultSet.getInt(5),resultSet.getString(6),
										resultSet.getString(7),resultSet.getInt(8),resultSet.getFloat(9)));
			
		}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	return cartData;		

}
/*public void checkPerticularHistoryOfUser(int userid) throws SQLException {
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("select * from cartdetail where userid = ? ");
		preparedStatement.setInt(1, userid);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println("Product id >> " + resultSet.getInt("productid") );
			System.out.println("Product Name >> " + resultSet.getString("productname"));
			System.out.println("Product Description >> "+ resultSet.getString("descriptions"));
			System.out.println("Quantity >> " + resultSet.getString("quantity"));
			System.out.println();	
		}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
}*/


public void setDataToCartdetailTable(int userid, String username,int productid, String productname, String description,int quantity, float price) throws SQLException {
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
	    connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("insert into cartdetail(userid,username,productid,productname,descriptions,quantity,price) values(?,?,?,?,?,?,?)" );
		
		preparedStatement.setInt(1, userid);
		preparedStatement.setString(2, username);
		preparedStatement.setInt(3, productid);
		preparedStatement.setString(4, productname);
		preparedStatement.setString(5, description);
		preparedStatement.setInt(6, quantity);
		preparedStatement.setFloat(7, price);
		preparedStatement.executeUpdate();
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}	
}


public RegisteredUser getUsernameAndPasswordFromTable(String enteredusername , String enteredpassword) throws SQLException{
	
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	RegisteredUser user = null;
	try {
		Connection connection = loadDriverandCreateConnetion.getconnetion();
		PreparedStatement preparedStatement = connection.prepareStatement("Select * from registereduserdetail where username= ? and passwords = ?");
		preparedStatement.setString(1, enteredusername);
		preparedStatement.setString(2, enteredpassword);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			user  = new RegisteredUser(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),
					  resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),
					  resultSet.getString(7), resultSet.getString(8),resultSet.getInt(9));
				
		}
		else {
			user = new RegisteredUser();
			user.setUserid(-1);
			
		}	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} 
	return user;
}

public void reduceQantityOfProduct(int productid,int enteredQuantityByUser) throws SQLException {
	
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();

	try {
		connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("update productdetail set quantity = quantity - ? where productid = ? and quantity>0"); 
		preparedStatement.setInt(1,enteredQuantityByUser);
		preparedStatement.setInt(2, productid);
		preparedStatement.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
}

/*public void getProductQuantity(int productid) throws SQLException {
	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
		connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("Select quantity from productdetail where productid = ?");
		preparedStatement.setInt(1, productid);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.println("Product quantity is >> " + rs.getInt("quantity"));
		}
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}*/

public float calculateBill( String username,int userid) throws SQLException {

	LoadDriverandCreateConnetion loadDriverandCreateConnetion = new LoadDriverandCreateConnetion();
	try {
		connection = loadDriverandCreateConnetion.getconnetion();
		preparedStatement = connection.prepareStatement("select sum(price) from cartdetail where userid = ?");
		preparedStatement.setInt(1, userid);
		ResultSet resultset = preparedStatement.executeQuery();
		while(resultset.next()) {
			float val = resultset.getFloat("sum(price)");
			sum= sum +val;
			
		}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	return sum;
	
}

public void DisplayAmmounttoEndUser() {
	System.out.println("Your total bill ammount >>>" + sum);
}


}

