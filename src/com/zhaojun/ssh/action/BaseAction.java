package com.zhaojun.ssh.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhaojun.ssh.model.User;
import com.zhaojun.ssh.service.SaveService;

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private User user;
	private SaveService saveService;
	@Override
	public String execute(){
		return SUCCESS;
	}
	public String register(){	
		saveService.saveUser(user);
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public SaveService getSaveService() {
		return saveService;
	}
	@Resource(name="saveService")
	public void setSaveService(SaveService saveService) {
		this.saveService = saveService;
		System.out.println("Äã±»³õÊ¼»¯Âð");
	}
	
}
