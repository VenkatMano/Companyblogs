/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.impl;

import com.companyblog.data.dao.inter.IUsersDao;
import com.companyblog.data.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Venkatesh
 */
public class UsersDaoImpl implements IUsersDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public boolean save(Users users)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try
        {        
        tx = session.beginTransaction();
        
        session.saveOrUpdate(users);
        tx.commit();
        session.close();
        return true;
        }
        catch(Exception ex)
        {
            tx.rollback();
            session.close();
            return false;
        }
        
    }
}
