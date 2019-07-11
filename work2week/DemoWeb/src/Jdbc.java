
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author srumudun
 *
 */
public class Jdbc {

	/**
	 * 
	 */
	public Jdbc() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from EMP");
		

	}

}
