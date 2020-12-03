package com.vwits.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vwits.db.EmployeeDAO;
import com.vwits.model.Employee;

@WebServlet("/insertdata")
public class InsertDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertDataServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empid = request.getParameter("txtEmpid");
		String ename = request.getParameter("txtEmpname");
		String salary = request.getParameter("txtSalary");
		EmployeeDAO d = new EmployeeDAO();
		d.save(new Employee(Integer.parseInt(empid), ename, Integer.parseInt(salary)));

		List<Employee> list = d.getAll();
		RequestDispatcher r = request.getRequestDispatcher("insert.jsp");
		request.setAttribute("data", list);
		r.forward(request, response);
	}

}
