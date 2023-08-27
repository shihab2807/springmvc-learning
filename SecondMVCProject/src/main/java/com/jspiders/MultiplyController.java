package com.jspiders;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiplyController {

	@RequestMapping("/multi")
	public ModelAndView multip(HttpServletRequest req,HttpServletResponse res) {
		
		int a=Integer.parseInt(req.getParameter("First Number"));
		int b=Integer.parseInt(req.getParameter("Second Number"));
		
	int product=a*b;
	
	ModelAndView mav=new ModelAndView();
	mav.setViewName("product.jsp");
	mav.addObject("product", product);
	
		return mav;
	}
}
