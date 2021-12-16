package com.dayanand.userloginregistration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dayanand.userloginregistration.entity.User;
import com.dayanand.userloginregistration.service.UserService;
import com.dayanand.userloginregistration.userDao.UserRepo;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	UserRepo userRepo;
	@Autowired
	HttpServletResponse response;
	@Autowired
	UserService userService;


	@RequestMapping("/login")
	public ModelAndView home(String uname, String upwd, ModelAndView mv,HttpServletRequest request) {

		User user = userService.findByUnameUpwd(uname, upwd);
		if (user == null) {
			mv.setViewName("index");
		} else {
			mv.addObject("user", user);
			mv.setViewName("welcome");
		}
		return mv;
	}

	@RequestMapping("/registration")
	public ModelAndView registration(ModelAndView mv) {

		mv.setViewName("registration");
		return mv;
	}

	@RequestMapping("/regvalidate")
	public ModelAndView regvalidate(User user, ModelAndView mv) {

		user = userService.getValidation(user);
		if (user == null) {
			mv.setViewName("index");
			return mv;

		} else {
			mv.addObject("user", user);
			mv.setViewName("welcome");
			return mv;
		}

	}

	@RequestMapping("/logout")
	public ModelAndView logout(ModelAndView mv) {

		mv.setViewName("index");
		return mv;

	}

	@RequestMapping("/videos")
	public String videos() {

		return "videos";

	}

	@RequestMapping("/home")
	public String home() {
		
	return "home";
}
	}
