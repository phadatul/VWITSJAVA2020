package com.vwits.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ModelAndView doSomething() {
		System.out.println("Bingo!!!you are here");

		ModelAndView model = new ModelAndView();

		model.setViewName("welcome");
		model.addObject("data", "HELLO THIS IS SAMPLE DATA 12345");
		return model;
	}

	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public ModelAndView getEmployee(Integer empid,String ename,Integer salary) {	

		System.out.println(empid + " " + ename + " " + salary);
		ModelAndView model = new ModelAndView();
		model.setViewName("final");
		model.addObject("data",empid + " " + ename + " " + salary);
		return model;
	}

}
