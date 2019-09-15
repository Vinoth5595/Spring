package com.vino.java_jdbc;

/**
 * @author Vinoth
 *
 */
import java.sql.*;
import java.util.*;

class StatementDemo {
	public static void main(String args[]) throws Exception {
		// Class.forName("com.mysql.jdbc.Driver"); -> Old
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinoth", "root", "root");
		System.out.println("Connection Established");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from laptop");

		System.out.println("laptop_Id  laptop_name");
		System.out.println("------------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
	}
}
