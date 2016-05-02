package com.zhaojun.ssh.serviceImpl;

import javax.annotation.Resource;

import com.zhaojun.ssh.dao.UserDao;
import com.zhaojun.ssh.daoImpl.UserDaoImpl;
import com.zhaojun.ssh.model.User;
import com.zhaojun.ssh.service.SaveService;

public class SaveServiceImpl implements SaveService {
	private UserDao userDao;
	@Override
	public void saveUser(User user) {		
		userDao.saveUser(user);

	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
