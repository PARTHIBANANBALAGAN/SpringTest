package com.howtodoinjava.demo.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.spring.model.UserRegisterForm;

@Repository//("loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean isValidate(UserRegisterForm login)
	{
		boolean status=false;
		UserRegisterForm loginform=(UserRegisterForm)sessionFactory.getCurrentSession().createQuery("from UserRegisterForm where name='"+login.getName()+"' and password='"+login.getPassword()+"'").uniqueResult();
		if(loginform!=null)
		{
			status=true;
		}
		return status;
	}

}
