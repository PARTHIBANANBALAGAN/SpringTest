package com.howtodoinjava.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.spring.model.UserRegisterForm;
import com.howtodoinjava.demo.spring.service.UserRegisterService;

@Controller
public class UserRegisterController {

	@Autowired
	private UserRegisterService userRegisterService;
	
	@RequestMapping(value="/UserRegister",method=RequestMethod.GET)
	public ModelAndView UserRegister()
	{
		return new ModelAndView("UserRegister","user",new UserRegisterForm());
	}
	
	@RequestMapping(value="/UserRegisterProcess",method=RequestMethod.POST)
	public ModelAndView UserRegisterProcess(@ModelAttribute("user") UserRegisterForm user,@RequestParam("file") CommonsMultipartFile file)
	{
		if(!file.isEmpty())
		{
				byte[] bytes=file.getBytes();
				user.setPhoto(bytes);
		}
		userRegisterService.userRegister(user);
		return new ModelAndView("UserRegister");
	}
}
