package day4.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.Resturant;
import day4.dao.DaoInterface;
import day4.dao.ResturantDao;

/**
 * Servlet implementation class Create_resturantServlet
 */
@WebServlet("/create_restaurant")
public class Create_resturantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String rest_id = request.getParameter("restId");
		String rest_name = request.getParameter("restname");
		String rest_cuisine = request.getParameter("restcuisine");
		String rest_bc = request.getParameter("restbranchcount");
		
		int restid = Integer.parseInt(rest_id);
		int branchcount = Integer.parseInt(rest_bc);
		
		Resturant rst = new Resturant(restid,rest_name,rest_cuisine,branchcount);
		DaoInterface<Resturant, Integer> idao = new ResturantDao();
		
		idao.create(rst);
		out.println("<h2>Created Successfully</h2>");
		//System.out.println(rest_id+","+rest_name+","+rest_cuisine+","+rest_bc);
	}

}
