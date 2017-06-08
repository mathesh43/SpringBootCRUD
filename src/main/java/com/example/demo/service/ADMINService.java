package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.MEMBER;

/**
 *
 * @author glsuser.
 *
 */
public interface ADMINService {

    /**
     *
     * @param member to add based on crud entity.
     */
    void add(MEMBER member);

    /**
     *
     * @return list contains all information.
     */
    List<MEMBER> getAllName();

    /**
     *
     * @param id delete the id.
     */
    void deleteName(Integer id);

    /**
     *
     * @param id get the id.
     * @return member entity based on id.
     */
    MEMBER getNameById(int id);

    /**
     *
     * @param member update the member entity.
     */
    void updateName(MEMBER member);

    /**
    *
    * @param member
     * @return list.
    */
   List<MEMBER> search(String text);


}
