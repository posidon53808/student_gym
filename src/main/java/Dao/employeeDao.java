package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.employee;

public class employeeDao implements implEmpDao {
public static void main(String [] args) {

 new employeeDao().delete(1);
}
	@Override
	public List<Object> queryAll() {
		Connection conn=implEmpDao.getDb();
		String SQL="select *from employee";
	List<Object> l= new ArrayList();
	
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				employee em=new employee();
				em.setId(rs.getInt("id"));
				em.setRoomNumber(rs.getString("roomNumber"));
				em.setIdCard(rs.getString("idCard"));
				l.add(em);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public Object queryId(int id) {
		Connection conn=implEmpDao.getDb();
		String SQL="select *from employee where id=?";
		employee em=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery(); 
			if(rs.next()) {
				em=new employee();
				em.setId(rs.getInt("id"));
				em.setRoomNumber(rs.getString("roomNumber"));
				em.setIdCard(rs.getString("idCard"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return em;
	}


	@Override
	public void delete(int id) {
		Connection conn=implEmpDao.getDb();
		String SQL="delete from employee where id=?";
		try {
		PreparedStatement ps=conn.prepareStatement(SQL);
		ps.setInt(1, id);
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		

	@Override
	public void update( String roomNumber, String idCard,int id) {
		Connection conn=implEmpDao.getDb();
		String SQL="update employee set roomNumber=?,idCard=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			
			ps.setString(1, roomNumber);
			ps.setString(2, idCard);
			ps.setInt(3, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
