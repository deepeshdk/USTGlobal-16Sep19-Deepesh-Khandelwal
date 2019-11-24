package com.ustglobal.jdbcwithhibernateapp;

import java.sql.*;

public class JdbcPreparedStatement1 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			// Step 1 : Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root");
			
			pstmt = con.prepareStatement("delete from employee_info where id = ?");
			
			int id = Integer.parseInt(args[0]);
			pstmt.setInt(1, id); // pstmt.setInt(1, Integer.parseInt(args[0]);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " Row(s) deleted");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
