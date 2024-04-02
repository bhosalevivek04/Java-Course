package firstJDBCapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp6 {
	public static void main(String[] args) 
	{
		Connection connect=null;
//		Statement statement;
		PreparedStatement pstat=null;
		try {
			connect=jdbcUtil.getConnection();
		
			String query="Insert into studentinfo(id,sname,sage,scity) values(?,?,?,?)";
			pstat=connect.prepareStatement(query);
			
			//execute query
			System.out.println("Please enter the following details to be stored in DB");
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter your id");
			Integer id=scan.nextInt();
			
			System.out.println("Enter your name");
			String name=scan.next();
			
			System.out.println("Enter your age");
			Integer age=scan.nextInt();
			
			System.out.println("Enter your City");
			String city=scan.next();
			
			pstat.setInt(1,id);
			pstat.setString(2, name);
			pstat.setInt(3,age);
			pstat.setString(4, city);
			
			int rowAffected=pstat.executeUpdate();
			//process the result
			if(rowAffected==0) {
				System.out.println("Unable to insert the data");
			}
			else {
				System.out.println("Data Inserted Successfully");
			}
			scan.close();
		
	}
		catch (SQLException e) {
			e.printStackTrace();
		} finally 
		{
			//close the resource
			try 
			{
				jdbcUtil.closeConnection(connect, pstat);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
