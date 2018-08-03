package com.howtodoinjava.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.demo.spring.dao.UserRegisterDao;
import com.howtodoinjava.demo.spring.model.UserRegisterForm;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{

	@Autowired
	private UserRegisterDao userRegisterDao;
	
	@Override
	@Transactional
	public void userRegister(UserRegisterForm user) {
		userRegisterDao.userRegister(user);		
	}
}
