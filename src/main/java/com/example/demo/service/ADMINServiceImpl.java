package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.DAO.ADMINDAO;
import com.example.demo.Entity.MEMBER;
/**
 *
 * @author glsuser
 *
 */

@Component
public class ADMINServiceImpl implements ADMINService {

    @Autowired
    private ADMINDAO admindao;

    /**
     *
     * @param admindao set  the person information.
     */
    public void setPersonDAO(ADMINDAO admindao) {
        this.admindao = admindao;
    }

    /**
     *
     * @param member add the crud.
     */
    public void add(MEMBER member) {

        admindao.add(member);

    }

    @Override
    public List<MEMBER> getAllName() {

        return admindao.getAllName();

    }

    @Override
    public void deleteName(Integer id) {
        admindao.deleteName(id);
    }

    @Override
    public MEMBER getNameById(int id) {
        MEMBER crud = admindao.getNameById(id);
        return crud;
    }

    @Override
    public void updateName(MEMBER member) {
        admindao.updateName(member);

    }

	@Override
	public List<MEMBER> search(String text) {
		System.out.println("in service"+text);
		return admindao.search(text);

	}

}
