package com.example.demo.DAO;

import java.util.List;

import com.example.demo.Entity.MEMBER;

/**
 *
 * @author glsuser
 *
 *         for crud operation perform for member in library management
 */
public interface ADMINDAO {

    /**
     *
     * @param member
     *            entity.
     */
    void add(MEMBER member);

    /**
     *
     * @return list.
     */
    List<MEMBER> getAllName();

    /**
     *
     * @param id
     *            delete the id.
     */
    void deleteName(Integer id);

    /**
     *
     * @param id
     *            send from controller.
     * @return return the whole information using crud.
     */
    MEMBER getNameById(int id);

    /**
     *
     * @param member
     *            updation.
     */
    void updateName(MEMBER member);

    /**
     *
     * @param crud
     * @return list.
     */
    List<MEMBER> search(String text);
}
