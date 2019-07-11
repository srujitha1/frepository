package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter ps = response.getWriter();
		ps.println("<h1>Unauthorized access</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int c=0;
		try {
			String name = request.getParameter("t1");
			String pwd = request.getParameter("t2");
			PrintWriter out = response.getWriter();
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
			Statement stmt = (Statement) con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from EMP");
			while(rs.next()) {
				if(rs.getString(1)==name && rs.getString(2)==pwd)
				{
			
						RequestDispatcher rd=request.getRequestDispatcher("Servlet1");
						rd.forward(request, response);
						c=1;
			
				}
			}
		
			if(c==0)
			{
			out.println("Sorry invalid credentials-------");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			}
			
		
		}
		catch(Exception e)
		{
			
		}
	}
	}


