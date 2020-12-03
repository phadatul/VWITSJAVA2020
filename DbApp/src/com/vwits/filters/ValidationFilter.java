package com.vwits.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFilter
 */
@WebFilter("/insertdata")
public class ValidationFilter implements Filter {

	public ValidationFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String empid = request.getParameter("txtEmpid");
		String ename = request.getParameter("txtEmpname");
		String salary = request.getParameter("txtSalary");
		System.out.println(empid.length());
		System.out.println(ename.length());
		System.out.println(salary.length());
		if (empid.length() <= 0 || ename.length() <= 1 || salary.length() <= 1) {
			response.getWriter().println("VALIDATION FAILED....... go back to insert page");
		} else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
