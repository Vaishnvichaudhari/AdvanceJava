package day4.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.CourseEntity;
import day4.beans.Resturant;
import day4.dao.CourseDao;
import day4.dao.DaoInterface;
import day4.dao.DaoInterfaceCourse;
import day4.dao.ResturantDao;

/**
 * Servlet implementation class Create_CourseServlet
 */

@WebServlet("/CourseServlet")
public class Create_CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("courseID");
		String tittle = request.getParameter("tittle");
		String duration = request.getParameter("duration");
		String provider = request.getParameter("provider");
		String fees = request.getParameter("fees");
		
		int cid = Integer.parseInt(id);
		int dt = Integer.parseInt(duration);
		int f = Integer.parseInt(fees);
		
		CourseEntity c1 = new CourseEntity(cid,tittle,dt,provider,f);
		DaoInterfaceCourse<CourseEntity, Integer> idao = new CourseDao();
		
		idao.create(c1);
		out.println("<h2>Created Successfully</h2>");
	}

}
