package com.jspiders.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.repositary.User;
import com.jspiders.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("/userdetail")
	public ModelAndView save(HttpServletRequest req,HttpServletResponse res) {

		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");

		User user=new User();
		
		service.persist(id,name,email);
		String s="Sign-up Successful...!";
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("user", s);
		
		return mav;
	}

}
