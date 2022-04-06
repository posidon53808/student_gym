package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface implEmpDao {
	static Connection getDb() {
		String URL="jdbc:mysql://localhost:3306/studentgym?useUnicode=true&characterEncoding=UTF-8";
		String username="root";
		String password="some12345"; 
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn= DriverManager.getConnection(URL,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return conn;
	}
	
	List<Object> queryAll();
	Object queryId(int id);
	void update(String roomNumber,String idCard,int id);
	void delete(int id);
	
}
