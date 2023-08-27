package com.jsp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiplyController {

	@RequestMapping("/multiply")
	public ModelAndView multiply(HttpServletRequest req,HttpServletResponse res) {
		
		int a=Integer.parseInt(req.getParameter("A"));
		int b=Integer.parseInt(req.getParameter("B"));
		int c= a*b;
		
//		System.out.println("Product of A and B is:"+c);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("output", c);
		
		return mav;
	}
}
