package com.ustglobal.jdbcwithhibernateapp;

import java.sql.*;

public class JdbcPreparedStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			// Step 1 : Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root");
			
			// Step 3 : Issue SQL Query
			String sql = "insert into employee_info values(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			// Step 4 : Read the Result
			System.out.println(count + " Row(s) Inserted");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Step 5 : Close all JDBC Object 
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
