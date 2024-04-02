package firstJDBCapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vivek@123";
		Connection connect=DriverManager.getConnection(url,user,password);
		
		//creating statement
		Statement statement=connect.createStatement();
		
		//execute query
		String sql="Select * from studentInfo";
		ResultSet rs=statement.executeQuery(sql);
		
		//process the result
		while(rs.next()) {
//		int id=rs.getInt(1);
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity"));			
		}
		//close the resource
		rs.close();
		statement.close();
		connect.close();

	}
}
