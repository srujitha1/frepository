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
 * Servlet implementation class Servletcreate
 */
public class Servletcreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletcreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("t1");
	    Emp e= new Emp();
	    e.setName(name);
	    EmpDaoImp obj = new EmpDaoImp();
	    try {
			obj.updateCheck(e);
			request.setAttribute("name", e.getName());
			request.setAttribute("id", e.getId());
			request.setAttribute("age", e.getAge());
			request.setAttribute("salary", e.getSalary());
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			rd.include(request, response);
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	}

}
