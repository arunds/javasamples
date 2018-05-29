package com.myapp.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController implements ServletContextAware {

	private ServletContext servletContext;

	@ModelAttribute
	@RequestMapping("/admin/showEmployee")
	protected ModelAndView showEmployee(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("----Show Employee----");
		return new ModelAndView();

	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

}
