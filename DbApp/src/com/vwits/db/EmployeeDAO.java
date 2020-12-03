package com.vwits.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vwits.model.Employee;

public class EmployeeDAO {
	MyDBConnection db = new MyDBConnection();

	public void save(Employee e) {
		PreparedStatement ps = db.getPreparedStatement("insert into emp values(?,?,?)");

		try {
			ps.setInt(1, e.getEmpid());
			ps.setString(2, e.getEname());
			ps.setInt(3, e.getSalary());

			ps.execute();
			db.closeConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();
		Statement st = db.getStatement();

		try {
			ResultSet rs = st.executeQuery("Select * from emp");
			while (rs.next()) {
				list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
