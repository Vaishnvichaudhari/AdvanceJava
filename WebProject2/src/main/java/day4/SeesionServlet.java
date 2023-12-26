package day4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SeesionServlet
 */
@WebServlet("/SeesionServlet")
public class SeesionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getContentType();
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String sessionId=session.getId();
	    session.getCreationTime();
	    long time=session.getCreationTime();
	    Date timeStamp= new Date(time);
	    out.println("<h2>Session Id:" + sessionId +"</h2>");
		out.println("<h2>Creation Time:" + timeStamp +"</h2>");
	}

}
