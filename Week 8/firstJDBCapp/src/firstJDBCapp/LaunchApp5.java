package firstJDBCapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vivek@123";
		Connection connect=DriverManager.getConnection(url,user,password);
		
		//creating statement
		Statement statement=connect.createStatement();
		
		String sql="update studentinfo set sage=23 where id=1";
		//execute query
		boolean status=statement.execute(sql);
		//process the result
		if(status) {
			System.out.println("If Block");
			//select
			ResultSet rs=statement.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		}
		else {
			System.out.println("Else Block");
			//insert,update,delete
			int rows=statement.getUpdateCount();
			if(rows==0) {
				System.out.println("Operation Failed");
			}else {
				System.out.println("Operation Successfully");	
			}
		}
		//close the resource
		statement.close();
		connect.close();
	}

}
