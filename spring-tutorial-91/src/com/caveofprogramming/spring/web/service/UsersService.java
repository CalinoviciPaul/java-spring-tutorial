package com.caveofprogramming.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.User;
import com.caveofprogramming.spring.web.dao.UsersDao;

import java.util.List;

@Service("usersService")
public class UsersService {
	
	private UsersDao usersDao;
	
	@Autowired
	public void setOffersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	
	public void create(User user) {
		usersDao.create(user);
	}

	public boolean exists(String username) {
		return usersDao.existsUsername(username);
	}

	@Secured("admin")
	public List<User> getAllUsers() {
		return usersDao.getAllUsers();
	}
}
