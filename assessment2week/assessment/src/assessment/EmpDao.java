package assessment;

import java.sql.SQLException;

public interface EmpDao {
	 
	
	public int create(Emp e) throws ClassNotFoundException, SQLException;
	public void update(Emp e) throws SQLException, ClassNotFoundException;
	public void retrieve(Emp e) ;
	public void delete(Emp e);

}
