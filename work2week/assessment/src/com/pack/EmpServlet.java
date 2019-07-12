package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assessment.Emp;
import assessment.EmpDaoImp;

/**
 * Servlet implementation class EmpServlet
 */
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-------dogettttttttttttttt--");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//String name=request.getParameter("t1");
			System.out.println("-------jdagjgfabgjfgabgj--");
			RequestDispatcher r=null;
			String option = request.getParameter("t1");
			System.out.println("Option : "+option);
			
			//ApplicationContext factory = new ClassPathXmlApplicationContext("configuration.xml");
			//EmpDaoImp obj = (EmpDaoImp)factory.getBean("empimp");
			switch(option)
			{
			    case "1":
				{
					r=request.getRequestDispatcher("retrieve.jsp");
					r.forward(request, response);
					break;
				}
			    case "2":
				{
					r=request.getRequestDispatcher("update.jsp");
					r.forward(request, response);
					break;
				}
			    case "3":
				{
					r=request.getRequestDispatcher("request.jsp");
					r.forward(request, response);
					break;
				}
			    case "4":
				{
					r=request.getRequestDispatcher("delete.jsp");
					r.forward(request, response);
					break;
				}
				default:
				{
					
				}
			}
			
		}
		catch(Exception e)
		{
			
		}
	}
}


