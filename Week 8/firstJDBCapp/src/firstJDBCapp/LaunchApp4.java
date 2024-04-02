package firstJDBCapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp4 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vivek@123";
		Connection connect=DriverManager.getConnection(url,user,password);
		
		//creating statement
		Statement statement=connect.createStatement();
		
		//execute query
		String sql="Delete from studentinfo where id=2";
		int rowAffected=statement.executeUpdate(sql);
		if(rowAffected==0) {
			System.out.println("Delete Failed");
		}
		else {
			System.out.println("Data deleted Successfully");
		}
		//process the result
		
		//close the resource
		statement.close();
		connect.close();

	}

}
