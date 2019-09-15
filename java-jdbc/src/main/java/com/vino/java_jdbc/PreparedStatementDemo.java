package com.vino.java_jdbc;

import java.sql.*;
import java.util.*;

class PreparedStatementDemo {
	public static void main(String args[]) throws Exception {
		// Class.forName("com.mysql.jdbc.Driver"); -> Old
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinoth", "root", "root");
		String sqlquery = "select lid,lname from laptop where lid=?";
		PreparedStatement pst = con.prepareStatement(sqlquery);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter laptop id: ");
		int lid = sc.nextInt();
		pst.setInt(1, lid);
		ResultSet rs = pst.executeQuery();

		System.out.println("laptop_Id  laptop_name");
		System.out.println("------------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
			break;
		}
	}
}