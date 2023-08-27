package com.movies.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.movies.model.Movies;
import com.movies.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@RequestMapping("/insert")
	public ModelAndView insertData(HttpServletRequest req,HttpServletResponse res) {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		
		String status=service.insertMovie(id, name, price);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("output", status);
		
		return mav;
		
	}
	@RequestMapping("/update")
	public ModelAndView updateData(HttpServletRequest req,HttpServletResponse res) {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		
		String status=service.updateMovie(id, name, price);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("update.jsp");
		mav.addObject("update", status);
		
		return mav;
//		System.out.println(service.updateMovie());
	}

	@RequestMapping("/delete")
	public void deleteData() {
		System.out.println(service.deleteMovie());
	}
	
	@RequestMapping("/fetch")
	public void getData() {
//		System.out.println(service.getMovie());
		for(Movies m:service.getMovie()) {
			System.out.println(m);
		}
	}
}
