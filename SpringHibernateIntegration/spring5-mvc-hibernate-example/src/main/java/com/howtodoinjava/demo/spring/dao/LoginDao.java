package com.howtodoinjava.demo.spring.dao;

import com.howtodoinjava.demo.spring.model.UserRegisterForm;

public interface LoginDao {
	public boolean isValidate(UserRegisterForm login); 
}
