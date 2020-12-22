package com.vwits.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vwits.demo.models.Employee;

@Controller
public class MyController {
	Employee e = new Employee();

	@RequestMapping(value = "/getemp", method = RequestMethod.GET)
	public ModelAndView getEmployee() {
		ModelAndView model = new ModelAndView();
		model.addObject("data", e);
		model.setViewName("result.jsp");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView insertEmployee(Integer empid, String ename, Integer salary) {
		e.setEmpid(empid);
		e.setEname(ename);
		e.setSalary(salary);
		ModelAndView model = new ModelAndView();
		model.setViewName("result.jsp");
		model.addObject("data", e);

		return model;
	}
}
