package com.example.demo.DAO;

import java.util.List;

import com.example.demo.Entity.CRUD;

public interface CRUDDAO {

	public void add(CRUD crud);

	public List<CRUD> getAllName();

	public void deleteName(Integer id);

	CRUD getNameById(int id);

	public void updateName(CRUD crud);
}
