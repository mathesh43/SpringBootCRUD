package com.example.demo.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.CRUD;

@Repository
public class CRUDDAOImpl implements CRUDDAO {

	private CRUD crud;

	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	@Transactional
	public void add(CRUD crud) {
		entityManager.persist(crud);
		

		
		
	}

}


