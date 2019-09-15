package com.vino.java_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementDemo {

	public static void main(String[] args) throws Exception {
		// Class.forName("com.mysql.jdbc.Driver"); -> Old
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinoth", "root", "root");
		CallableStatement cs = con.prepareCall("{call getlaptops()}");
		ResultSet rs = cs.executeQuery();

		System.out.println("laptop_Id  laptop_name");
		System.out.println("------------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
	}

}
