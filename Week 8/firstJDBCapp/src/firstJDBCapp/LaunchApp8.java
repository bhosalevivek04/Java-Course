package firstJDBCapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchApp8 {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement pstat=null;
		try {
			connect=jdbcUtil.getConnection();
			
			String sql="DELETE FROM studentinfo Where id=?";
			pstat=connect.prepareStatement(sql);
			
			Scanner scan =new Scanner(System.in);
			System.out.println("Please enter info that needs to delete");
			System.out.println("Enter the id");
			Integer id=scan.nextInt();	

			pstat.setInt(1, id);
			
			int rowAffected=pstat.executeUpdate();
			if(rowAffected==0) {
				System.out.println("Unable to delete");
			}
			else {
				System.out.println("Data Deleted Successfully");
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
