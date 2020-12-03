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

/**
 * Servlet implementation class GetEmplyeeController
 */
@WebServlet("/getdata")
public class GetEmplyeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmplyeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO d=new EmployeeDAO();
		List<Employee> list=d.getAll();
		RequestDispatcher r=request.getRequestDispatcher("home.jsp");
		request.setAttribute("data", list);
		r.forward(request, response);
	}

}
