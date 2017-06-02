package com.example.demo.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.CRUD;
import com.example.demo.service.CRUDService;
@Transactional
@Repository
public class CRUDDAOImpl implements CRUDDAO {

	private CRUD crud;

	private CRUDService crudservice;
	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	public void add(CRUD crud) {
		entityManager.persist(crud);		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<CRUD> getAllName() {
		System.out.println("controller before cruddao call*************************");
		String hql = "from CRUD";
		return (List<CRUD>) entityManager.createQuery(hql).getResultList();
		
		
	}
	@Override
	public void deleteName(Integer id) {
		entityManager.remove(getNameById(id));
		
	}
	@Override
	public CRUD getNameById(int id) {
		return entityManager.find(CRUD.class, id);
	}
	
	

}


