package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
  		PrintWriter out = response.getWriter();  
        out.print("<br>welcome to Register<br>");  
        
        String actionValue = request.getParameter("action");
		try {
			// switch case to perform the actions
			switch (actionValue) {

			case "insert":
				out.print("<br>Insert<br>");  
				//insertPatient(request, response);
				break;
			case "edit":
				out.print("<br>Edit<br>");  
				//editForm(request, response);
				break;
			case "update":
				out.print("<br>Update<br>");  
				//updatePatient(request, response);
				break;
			case "list":
				out.print("<br>List<br>");  
				//listPatient(request, response);
				break;
			case "delete":
				out.print("<br>Delete<br>");  
				//deletePatient(request, response);
				break;
			case "enable":
				out.print("<br>Enable<br>");  
				//activePatient(request, response);
				break;
			case "search":
				out.print("<br>Search<br>");  
				//searchPatient(request, response);
				break;

			default:
				break;

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
