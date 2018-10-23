/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.impl;

import com.companyblog.data.dao.inter.IUsersDao;
import com.companyblog.data.model.Users;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Venkatesh
 */
public class UsersDaoImpl implements IUsersDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveUser(Users users) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.saveOrUpdate(users);
            tx.commit();
            session.close();
            return true;
        } catch (Exception ex) {
            tx.rollback();
            session.close();
            return false;
        }

    }

    @Override
    public boolean saveOrUpdateUser(Users users) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.saveOrUpdate(users);
            tx.commit();
            session.close();
            return true;
        } catch (Exception ex) {
            tx.rollback();
            session.close();
            return false;
        }

    }

    @Override
    public boolean deleteUser(Users user) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.delete(user);
            tx.commit();
            session.close();
            return true;
        } catch (Exception ex) {
            tx.rollback();
            session.close();
            return false;
        }

    }

    public Users getUserUsingEmailId(String emailId) {
        Session session = sessionFactory.openSession();
        try {
            Criteria userCriteria = session.createCriteria(Users.class);
            userCriteria.add(Restrictions.eq("email", emailId));
            List<Users> userList = userCriteria.list();
            if (userList != null) {
                if (userList.size() == 1) {
                    return userList.get(0);
                }
            } else {
                return null;
            }

        } catch (Exception ex) {
            session.close();
            return null;
        }
        return null;
    }

    public List<Users> getUserList() {
        Session session = sessionFactory.openSession();
        try {
            Criteria userCriteria = session.createCriteria(Users.class);            
            List<Users> userList = userCriteria.list();
            if (userList != null) {
                return userList;
            } else {
                return null;
            }

        } catch (Exception ex) {
            session.close();
            return null;
        }
        
    }

}
