package com.howtodoinjava.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.howtodoinjava.demo.spring.dao.LoginDao;
import com.howtodoinjava.demo.spring.model.UserRegisterForm;

@Service//("loginService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean isValidate(UserRegisterForm login)
	{
		return loginDao.isValidate(login);
	}

}
