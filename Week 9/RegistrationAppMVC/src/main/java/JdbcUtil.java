import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
	static //static block executed during class loading
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection () throws SQLException{
		
		//Establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Vivek@123";
		return DriverManager.getConnection(url,user,password);
	}
	public static void closeConnection(Connection connect,PreparedStatement pstmnt) throws SQLException
	{
		//close Connection
		if(connect!=null)
			pstmnt.close();
		if(pstmnt!=null)
			pstmnt.close();
	}
}
