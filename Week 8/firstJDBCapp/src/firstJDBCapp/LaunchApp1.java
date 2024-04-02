package firstJDBCapp;
import java.sql.*;
public class LaunchApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vivek@123";
		Connection connect=DriverManager.getConnection(url,user,password);
		
		//creating statement
		Statement statement=connect.createStatement();
		
		//execute query
		String sql="Insert into studentinfo(id,sname,sage,scity) values(2,'Vishal',23,'Sakur')";
		int rowAffected=statement.executeUpdate(sql);
		//process the result
		if(rowAffected==0) {
			System.out.println("Unable to insert the data");
		}
		else {
			System.out.println("Data Inserted Successfully");
		}
		//close the resource
		statement.close();
		connect.close();
	}
}
  