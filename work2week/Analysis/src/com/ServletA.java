package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter ps = response.getWriter();
		ps.println("<h1>Unauthorized access</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  {
		int c=0;
		try {
			String name = request.getParameter("t1");
			String pwd = request.getParameter("t2");
			PrintWriter out = response.getWriter();
		    System.out.println("111111111111111111111111111111111111111111111111");
			//Class.forName("com.mysql.jdbc.Driver");
			//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
			//Statement stmt = (Statement) con.createStatement();
			//ResultSet rs=stmt.executeQuery("select * from EMP");
			//while(rs.next()) {
				//if(rs.getString(1).equals(name) && rs.getString(2).equals(pwd))
				//{
			JavaBeansDemo j=new JavaBeansDemo();
			
			int i= j.checkUser(name, pwd);
			System.out.println(i+"-----------------");
			if(i==1)
			{
			        
						RequestDispatcher rd=request.getRequestDispatcher("Servletf");
						rd.forward(request, response);
						c=1;
			}
			
				//}
			//}
		
			else
			{
				
			out.println("Sorry invalid credentials-------");
			
			RequestDispatcher rd=request.getRequestDispatcher("Registarion.html");
			rd.include(request, response);
			//RequestDispatcher rd=request.getRequestDispatcher("login.html");
			//rd.include(request, response);
			}
			
		
		}
		catch(Exception e)
		{
			
		}
	}

}
