package com.vwits.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbOperations {
	MyDBConnection db = new MyDBConnection();

	public void insertData(int id, String name) {
		Statement st = db.getStatement();
		try {
			int x=st.executeUpdate("insert into vwits values(" + id + ",'" + name + "')");
			System.out.println("Rows inserted="+x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		db.closeConnection();
	}

	public List readData() {
		List l = new ArrayList();

		Statement st = db.getStatement();
		try {
			ResultSet rs = st.executeQuery("select * from vwits");

			while (rs.next()) {
				l.add(rs.getInt(1) + "=" + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		db.closeConnection();

		return l;
	}
}
