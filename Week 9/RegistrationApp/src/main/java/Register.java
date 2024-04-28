import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@WebServlet("/Register")
public class Register extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in Servlet");
		
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String upassword=request.getParameter("upassword");
		String ucity=request.getParameter("ucity");
		
		//Load and Register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbclearning";
			String user="root";
			String password="Vivek@123";
			Connection connect=DriverManager.getConnection(url,user,password);
		
			PreparedStatement pstmt=connect.prepareStatement("Insert into personalinfo(uname,email,upassword,ucity)"+"values(?,?,?,?)");
			pstmt.setString(1, uname);
			pstmt.setString(2,email);
			pstmt.setString(3, upassword);
			pstmt.setString(4, ucity);
			
			int rowAffected=pstmt.executeUpdate();
			PrintWriter pw=response.getWriter();
			if(rowAffected!=0) {
				pw.println("<h1>Registration Success</h1>");
			}
			else {
				pw.println("<h1>Registration Failed</h1>");
			}
			pstmt.close();
			connect.close();
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
