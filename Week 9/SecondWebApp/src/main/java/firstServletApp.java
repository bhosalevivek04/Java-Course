

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/firstservlet")
public class firstServletApp extends HttpServlet {
	public firstServletApp() {
		System.out.println("Servlet obj is created internally by container");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		
		PrintWriter writer=response.getWriter();

//		writer.println("Hello "+name);
//		writer.println("I know you are from "+city);
		
		writer.println("<html><head><title>Second App</title></head>");
		writer.println("<body bgcolor='cyan'> <h1><marquee>Welcome to our dynamic App</marquee></h1>");
		writer.println("<table>");
		writer.println("<tr><th>Name</th> <th>City</th> </tr>");
		writer.println("<tr><td>"+name+"</td> <td>"+city+"</td></tr>");
		writer.println("</table></body>");
		writer.println("</html>");
		writer.close();
	}

}
