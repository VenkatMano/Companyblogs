/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.impl;

import com.companyblog.data.dao.inter.IAnswersDao;
import com.companyblog.data.model.Answers;
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
public class AnswersDaoImpl implements IAnswersDao {
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public boolean saveAnswer(Answers answer)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.saveOrUpdate(answer);
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
    public boolean deleteAnswer(Answers answer)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.delete(answer);
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
    public boolean updateAnswer(Answers answer)
    {
       Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.update(answer);
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
    public List<Answers> getAnswersByQuestionId(int questionId)
    {
        Session session = sessionFactory.openSession();
        try {
            Criteria answerCriteria = session.createCriteria(Answers.class);
            answerCriteria.add(Restrictions.eq("id", questionId));
            List<Answers> answerList = answerCriteria.list();
            if (answerList != null) {
                return answerList;
            } else {
                return null;
            }

        } catch (Exception ex) {
            session.close();
            return null;
        }
      
    }
}
