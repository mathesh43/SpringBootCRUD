package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 *
 *@author glsuser
 *
 */
@Entity
@Component
public class MEMBER {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String fathername;
    @Column
    private long contactno;

    @Column
    private String dob;
    @Column
    private String email;
    @Column
    private long aadharcardno;
    @Column
    private String address;

    /**
     * constructor.
     */
    public MEMBER() {
        super();

    }
    /**
     *
     * @return id.
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @param id set the id value.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the name.
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @param name set the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return father name.
     */
    public String getFathername() {
        return fathername;
    }
    /**
     *
     * @param fathername set the fathername.
     */

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    /**
     *
     * @return  contactno.
     */
    public long getContactno() {
        return contactno;
    }
    /**
     *
     * @param contactno set contact no.
     */

    public void setContactno(long contactno) {
        this.contactno = contactno;
    }

    /**
     *
     * @return dob.
     */
    public String getDob() {
        return dob;
    }

    /**
     *
     * @param dob set dob.
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     *
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     *
     * @return aadharcardno.
     */

    public long getAadharcardno() {
        return aadharcardno;
    }

    /**
     *
     * @param aadharcardno set aadharcardno.
     */
    public void setAadharcardno(long aadharcardno) {
        this.aadharcardno = aadharcardno;
    }

    /**
     *
     * @return address.
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address set the address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
