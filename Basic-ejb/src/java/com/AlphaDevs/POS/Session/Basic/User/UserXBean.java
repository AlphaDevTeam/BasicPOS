/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlphaDevs.POS.Session.Basic.User;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author MKarunarathne
 */
@Stateless
@LocalBean
public class UserXBean {

    public String getTimeasString() {
        return new Date().toString();
    }

}
