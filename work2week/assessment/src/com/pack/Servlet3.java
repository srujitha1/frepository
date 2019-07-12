package com.pack;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assessment.Emp;
import assessment.EmpDaoImp;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hjafhfhauihfuahui");
		String name = request.getParameter("t1");
		String age=request.getParameter("t2");
		String salary=request.getParameter("t3");
		Emp e = new Emp();
		e.setAge(age);
		e.setName(name);
		e.setSalary(salary);
		e.setId();
		//ApplicationContext factory = new ClassPathXmlApplicationContext("configuration.xml");
		//EmpDao obj = (EmpDaoImp)factory.getBean("empimp");
		EmpDaoImp obj = new EmpDaoImp();
		try {
			System.out.println("afjkhjkasbhdjk");
			obj.update(e);
		
			RequestDispatcher rd=request.getRequestDispatcher("option.jsp");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}


