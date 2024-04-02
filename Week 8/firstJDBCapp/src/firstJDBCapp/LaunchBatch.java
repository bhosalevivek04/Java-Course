package firstJDBCapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LaunchBatch {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement pstat=null;
		try {
			connect=jdbcUtil.getConnection();
			
			String sql="Update studentinfo SET id=? Where id=?";
			pstat=connect.prepareStatement(sql);
			
			pstat.setInt(1, 20);
			pstat.setInt(2, 1);
			pstat.addBatch();
			pstat.setInt(1, 24);
			pstat.setInt(2, 2);
			pstat.addBatch();
			pstat.setInt(1, 25);
			pstat.setInt(2, 3);
			
			pstat.executeBatch();
			System.out.println("Check the database");
			
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
