/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlphaDevs.Beans;

import com.AlphaDevs.POS.Session.Basic.User.UserXBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author MKarunarathne
 */
@ManagedBean
@RequestScoped
public class TestJSFBean {
    @EJB
    private UserXBean userXBean;

    /**
     * Creates a new instance of TestJSFBean
     */
    public TestJSFBean() {
    }
    
    public String gettimefromBean(){
        return userXBean.getTimeasString();
    }
}
