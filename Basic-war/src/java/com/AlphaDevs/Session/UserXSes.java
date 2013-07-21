/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlphaDevs.Session;

import com.AlphaDevs.POS.Session.Basic.User.UserXBean;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author MKarunarathne
 */
@Stateless
@LocalBean
public class UserXSes {
    @EJB
    private UserXBean userXBean;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public String getTimefromBean(){
        return userXBean.getTimeasString();
    }
}
