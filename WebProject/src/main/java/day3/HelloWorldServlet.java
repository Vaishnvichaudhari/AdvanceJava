package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//This methods get invoked when the servlet is requested
		//Swtting the MIME type to generate HTML response
		//MIME: MUltipurpose Internal Mail Extension
		
		String mimeType="text/html";
		response.setContentType(mimeType);
		
		String responseText="<h1 style='color:red'>Hello World from Servlet</h1>";
		
		//Obtaining PrintWriter Associated with the response
		
		PrintWriter out=response.getWriter();
		out.println(responseText);
		
			
		
		
	}

}