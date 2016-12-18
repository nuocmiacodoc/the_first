package com.example.web;
import com.example.model.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class BeerSelect
 */
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BeerSelect() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);
		//out.println("<br>Got beer color " + c);
		//out.println("Beer Selection Advice: ");
		//Iterator<String> it = result.iterator();
		//while(it.hasNext()) {
		//out.print("<br>try: " + it.next());
		//}
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}

}






