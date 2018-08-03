package com.howtodoinjava.demo.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.spring.model.UserRegisterForm;

@Repository
public class UserRegisterDaoImpl implements UserRegisterDao{

	@Autowired
	private SessionFactory sessionFactory;
	   
	@Override
	public void userRegister(UserRegisterForm user) {
		this.sessionFactory.getCurrentSession().save(user);		
	}

}
