package firstJDBCapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchApp7 {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement pstat=null;
		try {
			connect=jdbcUtil.getConnection();
			
			String sql="Update studentinfo SET sage=? Where id=?";
			pstat=connect.prepareStatement(sql);
			
			Scanner scan =new Scanner(System.in);
			System.out.println("Please enter info that needs to update");
			System.out.println("Enter your id where you can change");
			Integer id=scan.nextInt();	
	
			System.out.println("Please enter your age to be update");
			Integer age=scan.nextInt();
			
			pstat.setInt(1, age);
			pstat.setInt(2, id);
			
			int rowAffected=pstat.executeUpdate();
			if(rowAffected==0) {
				System.out.println("Unable to update");
			}
			else {
				System.out.println("Data Updated Successfully");
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
