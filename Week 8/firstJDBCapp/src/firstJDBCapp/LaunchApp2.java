package firstJDBCapp;

import java.sql.*;

public class LaunchApp2 {

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
		String sql="Update studentinfo set sage=22 where id=2";
		int rowAffected=statement.executeUpdate(sql);
		if(rowAffected==0) {
			System.out.println("Update Failed");
		}
		else {
			System.out.println("Data updated Successfully");
		}
		//process the result
		
		//close the resource
		statement.close();
		connect.close();

	}

}
