package com.example.demo.service;

import java.util.List;

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

	

	public void add(CRUD crud) {

		cruddao.add(crud);

	}

	@Override
	public List<CRUD> getAllName() {

		return cruddao.getAllName();

	}

	@Override
	public void deleteName(Integer id) {
		cruddao.deleteName(id);
	}

	@Override
	public CRUD getNameById(int id) {
		CRUD crud = cruddao.getNameById(id);
		return crud;
	}

	@Override
	public void updateName(CRUD crud) {
		cruddao.updateName(crud);

	}

}
