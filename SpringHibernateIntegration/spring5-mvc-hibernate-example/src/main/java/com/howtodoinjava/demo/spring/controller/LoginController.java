package com.howtodoinjava.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.spring.model.UserRegisterForm;
import com.howtodoinjava.demo.spring.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView LoginPage()
	{
		return new ModelAndView("Login","login",new UserRegisterForm());
	}
	
	/*@RequestMapping(value="/Login",method=RequestMethod.POST)
	public ModelAndView LoginProcess(@ModelAttribute("login") LoginForm loginForm)
	{
		loginService.isValidate(loginForm);
		return new ModelAndView("Process");
	}*/
	
	@RequestMapping(value="/Login",method=RequestMethod.POST)
	public ModelAndView LoginProcess(@ModelAttribute("login") UserRegisterForm userRegisterForm,Model map)
	{
		boolean status=loginService.isValidate(userRegisterForm);
		if(status==true)
		{
			map.addAttribute("status","Login Successfully.");
			return new ModelAndView("UserRegister");
		}
		else
		{
			map.addAttribute("status","User Name or Password Invalid.");
			return new ModelAndView("Login");
		}
		
	}
	
	
}
