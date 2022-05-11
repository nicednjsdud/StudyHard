package kr.co.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import kr.co.connect.jdbcexam.dto.Role;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	public Role getRole(Integer roleId) {
		
		Role role = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbUser,dbpasswd);
			String sql="SELECT role_id,description form role where role_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
			rs = ps.executeQuery();
			
			if(rs.next())
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {		// 더 안전
				try {
					rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps !=null) {		// 더 안전
				try {
					ps.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn !=null) {		// 더 안전
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return role;
	}
	
	
}
