package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpDaoImp implements EmpDao{
	Connection con;
	int counter=0;
	public int create(Emp e) throws ClassNotFoundException, SQLException 
	{
		///Class.forName("com.mysql.jdbc.Driver");
		///con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sapient123");
		System.out.println("afklaflknklafnh");
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1","root","Sapient123");
		
		PreparedStatement pstmt =con.prepareStatement("insert into Emp values(?,?,?,?)");	
		
		pstmt.setString(1,e.getName());
		pstmt.setInt(2,e.getId());
		pstmt.setString(3,e.getAge());
		pstmt.setString(4,e.getSalary());
		pstmt.execute();
		return 0;
		
	}
	public void update(Emp e) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1","root","Sapient123");
		Statement pstmt =con.prepareStatement("update Emp set salary='"+e.getSalary()+"'  where name='"+e.getName());	
		
	}
	public int updateCheck(Emp e) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1","root","Sapient123");
		PreparedStatement pstmt =con.prepareStatement("select * from Emp");
		ResultSet rs=pstmt.executeQuery();
		while(pstmt!=null)
		{
			if(rs.getString("name")==e.getName())
				{
					String age;
					age=rs.getString(3);
					e.setAge(age);
				
					
					String salary;
					salary=rs.getString(4);
					e.setSalary(salary);
							
				}
				}
		return 0;
	}
	public void retrieve(Emp e)
	{
		Statement stmt;
		ResultSet rs;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Emp");
			while(rs.next())
			{
				if(rs.getInt(2)==e.getId())
				System.out.println("name :"+rs.getString(1));
				System.out.println("age is"+rs.getInt(2));
				
			}
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	public void delete(Emp e)
	{
		Statement stmt;
		ResultSet rs;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("delete from Emp where e.getInt(2)=e.getId");
			
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
