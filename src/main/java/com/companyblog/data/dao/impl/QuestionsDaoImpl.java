/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.impl;

import com.companyblog.data.dao.inter.IQuestionsDao;
import com.companyblog.data.model.Questions;
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
public class QuestionsDaoImpl implements IQuestionsDao{
    
    @Autowired
    SessionFactory sessionFactory;
    
    public boolean saveQuestion(Questions question)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try
        {            
            session.save(question);
            tx.commit();
            session.close();
            return true;
        }
        catch(Exception ex)
        {
            tx.rollback();
            session.close();
        }
        return false;
    }
    
    public boolean deleteQuestion(Questions question)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try
        {            
            session.delete(question);
            tx.commit();
            session.close();
            return true;
        }
        catch(Exception ex)
        {
            tx.rollback();
            session.close();
        }
        return false;
    }
    
    public boolean updateQuestion(Questions question){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try
        {            
            session.saveOrUpdate(question);
            tx.commit();
            session.close();
            return true;
        }
        catch(Exception ex)
        {
            tx.rollback();
            session.close();
        }
        return false;
    }
    
    public Questions getQuestionByQuestionId(int questionId){
        Session session = sessionFactory.openSession();
        try
        {
            Criteria questionCriteria = session.createCriteria(Questions.class);
            questionCriteria.add(Restrictions.eq("Id", questionId));
            List<Questions> questionList = questionCriteria.list();
            session.close();
            return questionList.get(0);
        }
        catch(Exception ex)
        {
            session.close();
            return null;
        }
    }
    
    public List<Questions> getQuestionsByUsersId(int userId){
        Session session = sessionFactory.openSession();
        try
        {
            Criteria questionCriteria = session.createCriteria(Questions.class);
            questionCriteria.add(Restrictions.eq("UserId", userId));
            List<Questions> questionList = questionCriteria.list();
            session.close();
            return questionList;
        }
        catch(Exception ex)
        {
            session.close();
            return null;
        }
    } 
}
