import java.sql.DriverManager;
import java.sql.SQLException;

public class LaunchClassForNameEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Demo d=new Demo();
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	}

}
class Demo{
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block ==> Non Static");
	}
}
