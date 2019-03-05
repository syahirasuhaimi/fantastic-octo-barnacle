package projDb_One;

import java.util.*;
import java.sql.*;

public class StudentModel {
	/*
	public List<Student> findAll(){
		
		try {
			List<Student> listStudent = new ArrayList();
			PreparedStatement ps = ConnectDB.getConnection().prepareStatement("SELECT * FROM tbl_student");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Student s = new Student();
				s.setSid(rs.getInt("s_id"));
				s.setSname(rs.getString("s_name"));
				s.setSclass(rs.getString("s_class"));
				s.setSphone(rs.getString("s_phone"));
				listStudent.add(s);
			}
			return listStudent;	
			
		} catch (Exception e) {
			return null;
	
		}
	}
	
	public Student find(int sid){
		
		try {
			Student s = new Student();
			PreparedStatement ps = ConnectDB.getConnection().prepareStatement("SELECT * FROM tbl_student where s_id=?");
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				s.setSid(rs.getInt("s_id"));
				s.setSname(rs.getString("s_name"));
				s.setSclass(rs.getString("s_class"));
				s.setSphone(rs.getString("s_phone"));
		
			}
			return null;	
			
		} catch (Exception e) {
			return null;
	
		}
	}
	
	public boolean create(Student s){
		try {
			PreparedStatement ps = ConnectDB.getConnection().prepareStatement("INSERT INTO tbl_student values (?,?,?)");
			ps.setString(1, s.getSname());
			ps.setString(2, s.getSclass());
			ps.setString(3, s.getSphone());
			
			return ps.executeUpdate()>0;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean edit(Student s){
		try {
			PreparedStatement ps = ConnectDB.getConnection().prepareStatement("UPDATE tbl_student set s_name=?, s_class=?, s_phone=? where s_id=?");
			ps.setString(1, s.getSname());
			ps.setString(2, s.getSclass());
			ps.setString(3, s.getSphone());
			ps.setInt(4, s.getSid());
			
			return ps.executeUpdate()>0;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean delete(Student s){
		try {
			PreparedStatement ps = ConnectDB.getConnection().prepareStatement("delete from tbl_student s_id=?");
			ps.setInt(1, s.getSid());
			
			return ps.executeUpdate()>0;
		} catch (Exception e) {
			return false;
		}
	}*/
}
