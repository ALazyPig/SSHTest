package com.zhaojun.ssh.daoImpl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zhaojun.ssh.dao.UserDao;
import com.zhaojun.ssh.model.User;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	@Override
	public void saveUser(User user) {
		Session s = sessionFactory.getCurrentSession();
		s.save(user);
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
