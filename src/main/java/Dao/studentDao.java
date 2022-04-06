package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.employee;
import Model.student;
import Dao.studentDao;

public class studentDao implements implDao{
public static void main(String [] args) {
	student s= new student("wdw","fwf","ff","333");
	new studentDao().add(s);
}
	@Override
	public void add(Object o) {
		
		String SQL="insert into student(roomNumber,idCard,equipment,time)values(?,?,?,?)";
		Connection conn=implDao.getDb();
		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(SQL);
			student s=(student)o;
			ps.setString(1,s.getRoomNumber());
			ps.setString(2, s.getIdCard());
			ps.setString(3, s.getEquipment());
			ps.setString(4, s.getTime());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Object> queryAll() {
		Connection conn=implDao.getDb();
		String SQL="select *from student";
		List<Object> l= new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				student s=new student();
				s.setId(rs.getInt("id"));
				s.setRoomNumber(rs.getString("roomNumber"));
				s.setIdCard(rs.getString("idCard"));
				s.setEquipment(rs.getString("equipment"));
				s.setTime(rs.getString("time"));
				l.add(s);
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
		String SQL="select *from student where id=?";
		student s=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				s=new student();
				s.setId(rs.getInt("id"));
				s.setRoomNumber(rs.getString("roomNumber"));
				s.setIdCard(rs.getString("idCard"));
				s.setEquipment(rs.getString("equipment"));
				s.setTime(rs.getString("time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	@Override
	public void delete(int id) {
		Connection conn=implEmpDao.getDb();
		String SQL="delete from student where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}