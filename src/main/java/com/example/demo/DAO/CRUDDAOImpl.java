package com.example.demo.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.CRUD;

@Repository
public class CRUDDAOImpl implements CRUDDAO {

//	@Autowired
//	private SessionFactory sessionFactory;
	private CRUD crud;

	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	@Transactional
	public void add(CRUD crud) {
		
		
		entityManager.persist(crud);
		
		
//		sessionFactory.getCurrentSession().saveOrUpdate(crud);
//		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Hibernate3" );
//	      
//	      EntityManager entitymanager = emfactory.createEntityManager( );
//	      entitymanager.getTransaction( ).begin( );
//	      crud.setFirstname("mathesh");
//	      crud.setLastname( "waran" );
//	      entitymanager.persist( crud );
//	      entitymanager.getTransaction( ).commit( );
//	      
//	      System.out.println(crud.getFirstname()+crud.getLastname());
//	      entitymanager.close( );
//	      emfactory.close( );
	 
		
		
	}

}


