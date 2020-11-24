package com.vwits.persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VWEmpRepo {
	MyDBConnection db = new MyDBConnection();

	public int insertEmployee(VWEmployee emp) {
		int x = 0;

		PreparedStatement ps = db.getPreparedStatement("insert into vwemployee values(?,?,?,?,?,?)");
		try {
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getFirsetName());
			ps.setString(3, emp.getLastName());
			ps.setInt(4, emp.getSalary());
			ps.setString(5, emp.getCity());
			ps.setString(6, emp.getState());
			x = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeConnection();
		}
		return x;
	}

	public int updateEmployee(VWEmployee emp) {
		int x = 0;
		String sql = "update vwemployee set firstname=?,lastname=?,salary=?,city=?,state=? where id=?";
		PreparedStatement ps = db.getPreparedStatement(sql);
		try {
			ps.setInt(6, emp.getEmpid());
			ps.setString(1, emp.getFirsetName());
			ps.setString(2, emp.getLastName());
			ps.setInt(3, emp.getSalary());
			ps.setString(4, emp.getCity());
			ps.setString(5, emp.getState());
			x = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeConnection();
		}
		return x;
	}

	public int deleteEmployee(VWEmployee emp) {
		int x = 0;

		PreparedStatement ps = db.getPreparedStatement("delete from vwemployee where id=?");
		try {
			ps.setInt(1, emp.getEmpid());

			x = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeConnection();
		}
		return x;
	}

	public List<VWEmployee> getAll() {
		List<VWEmployee> list = new ArrayList<VWEmployee>();
		Statement st = db.getStatement();
		try {
			ResultSet rs = st.executeQuery("Select * from vwemployee");
			while (rs.next()) {
				list.add(new VWEmployee(rs.getInt(1), rs.getInt("salary"), rs.getString(2), rs.getString(3),
						rs.getString(5), rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.closeConnection();
		}

		return list;
	}

}
