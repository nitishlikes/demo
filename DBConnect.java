package testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
public static String SelectQuery = "select * from products";
public static String SelectQueryOrders = "select * from orders";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_db","root","root");
		
		PreparedStatement ps = c.prepareStatement(SelectQueryOrders);
		ResultSet r = ps.executeQuery();
		r.next();
		//System.out.println(r.getString("product_name"));
		while(r.next())
		{
			System.out.println(r.getInt(1)+ "-"+r.getInt(2)+"-" +r.getInt(3));
		}
		
		c.close();
		
		
		
	}

}
