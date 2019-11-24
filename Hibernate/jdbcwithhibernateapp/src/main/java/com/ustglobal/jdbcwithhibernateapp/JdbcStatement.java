package com.ustglobal.jdbcwithhibernateapp;

import java.sql.*;

public class JdbcStatement {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		try {
			
			// Step 1 : Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root");
			String sql = "update employee_info set name = 'Oven', sal = 5000, gender = 'Other' where id = 7";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count + " Row(s) updated");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
