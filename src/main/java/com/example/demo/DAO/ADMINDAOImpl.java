package com.example.demo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.apache.lucene.search.Query;
import org.hibernate.search.Search;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.MEMBER;

/**
 *
 * @author glsuser
 *
 */
@Transactional
@Repository
public class ADMINDAOImpl implements ADMINDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    MEMBER member;

    @Override
    public void add(MEMBER member) {
        entityManager.persist(member);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<MEMBER> getAllName() {

        String hql = "from MEMBER";
        return (List<MEMBER>) entityManager.createQuery(hql).getResultList();

    }

    @Override
    public void deleteName(Integer id) {
        entityManager.remove(getNameById(id));

    }

    @Override
    public MEMBER getNameById(int id) {
        return entityManager.find(MEMBER.class, id);
    }

    @Override
    public void updateName(MEMBER member) {
        MEMBER membername = getNameById(member.getId());
        membername.setName(member.getName());
        membername.setFathername(member.getFathername());
        membername.setContactno(member.getContactno());

        membername.setDob(member.getDob());
        membername.setEmail(member.getEmail());
        membername.setAadharcardno(member.getAadharcardno());
        membername.setAddress(member.getAddress());
        entityManager.flush();
    }
	public List<MEMBER> search(String text) {
    	List<MEMBER> member = new ArrayList<MEMBER>();
    	String hql = "from MEMBER where name like :text or fathername like :text or address like :text or email like :text  ";
    	javax.persistence.Query q=entityManager.createQuery(hql);
    	q.setParameter("text", "%" + text + "%");
 	   member = q.getResultList();
 	   return member;


    }


}
