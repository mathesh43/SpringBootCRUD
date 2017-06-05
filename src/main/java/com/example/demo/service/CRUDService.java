package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.CRUD;

public interface CRUDService {

	public String hello();

	public void add(CRUD crud);

	public List<CRUD> getAllName();

	public void deleteName(Integer id);

	CRUD getNameById(int id);

	public void updateName(CRUD crud);

}
