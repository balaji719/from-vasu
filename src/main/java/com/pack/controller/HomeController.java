package com.pack.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/abcd")
public class HomeController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String greeting = "Welecome to spring mvc demo";
		return new ModelAndView("home", "message", greeting);
	}

	@Controller
	@RequestMapping("/vasu")
	public class MyController {
		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView myRequest(HttpServletRequest request, HttpServletResponse response) {
			String mystring = "welcome to spring dear vasu";
			return new ModelAndView("home", "hellomessage", mystring);
		}
	}
}