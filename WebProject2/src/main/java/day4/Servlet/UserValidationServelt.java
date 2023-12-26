package day4.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.User;
import day4.beans.UserValidator;

/**
 * Servlet implementation class UserValidationServelt
 */
@WebServlet(name = "myUserValidationServelt", urlPatterns = { "/doValidate" })
public class UserValidationServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        
	        //Fteching the request parameter
	       String Username = request.getParameter("uid");
	        String Password = request.getParameter("pwd");
	        
	        //Populating User Object based upon username and password
	        User appUser=new User(Username,Password);
	        
	        //Sending user object to user validator for checking its validity
	        boolean valid=  UserValidator.isValid(appUser);
	        if(valid)
	        	out.println("<h2 style='color:green'>Congrulations! you are IN</h2>");
	        else
	        	out.println("<h2  style='color:red'>Access denied</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
