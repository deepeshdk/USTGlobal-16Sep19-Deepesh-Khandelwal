package com.ustglobal.jdbcwithhibernateapp;

import java.sql.*;

public class JdbcStatement1 {

		public static void main(String[] args) {

			Connection con = null;
			Statement stmt = null;
			try {
				
				// Step 1 : Load the Driver
				Class.forName("com.mysql.jdbc.Driver");
				
				// Step 2 : Get the connection
				String sql = "delete from employee_info where id = 7";
				con = DriverManager.getConnection("jdbc:mysql://localhost:33062/ust_ty_db?user=root&password=root");
				
				stmt = con.createStatement();
				int count = stmt.executeUpdate(sql);
				
				System.out.println(count + " Row(s) deleted");
				
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
