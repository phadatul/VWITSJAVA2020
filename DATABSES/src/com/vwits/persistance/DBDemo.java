package com.vwits.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	public static void main(String[] args) {
		try {
//oracle.jdbc.driver.OracleDriver
			Class.forName("com.mysql.jdbc.Driver");
//jdbc:oracle:thin:@localhost:1521:orcl
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

			// Statement st = con.createStatement();

			// st.execute("QUERY"); boolean //DDL
			// st.executeUpdate("QUERY"); int //DML
			// st.executeQuery("QUERY"); ResultSet //SELECT

			// st.execute("create table vwemployee(id int,firstname varchar(50),lastname
			// varchar(50),salary int, city varchar(20),state varchar(30))");
			int id = 2;
			String first = "Atul";
			String last = "Phad";
			int salary = 99;
			String city = "Pune";
			String state = "Maharashtra";

			PreparedStatement ps = con.prepareStatement("insert into vwemployee values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, first);
			ps.setString(3, last);
			ps.setInt(4, salary);
			ps.setString(5, city);
			ps.setString(6, state);
			int rows = ps.executeUpdate();

			System.out.println(rows);

			ResultSet rs = ps.executeQuery("Select * from vwemployee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5) + " " + rs.getString(6));
			}
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
