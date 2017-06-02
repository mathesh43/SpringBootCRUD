package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.DAO.CRUDDAO;
import com.example.demo.Entity.CRUD;

@Component
public class CRUDServiceImpl implements CRUDService {

	@Autowired
	private CRUDDAO cruddao;

	public void setPersonDAO(CRUDDAO cruddao) {
		this.cruddao = cruddao;
	}

	
	public String hello() {
		return "welcome";
	}
	public void add(CRUD crud) {
		System.out.println("controller before cruddao call*************************");
		cruddao.add(crud);
		System.out.println("controller after cruddao call*************************");
	}
	
}
