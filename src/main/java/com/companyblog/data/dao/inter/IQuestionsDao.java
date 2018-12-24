/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.inter;

import com.companyblog.data.model.Questions;
import java.util.List;

/**
 *
 * @author Venkatesh
 */
public interface IQuestionsDao {
    
    public boolean saveQuestion(Questions question);
    
    public boolean deleteQuestion(Questions question);
    
    public boolean updateQuestion(Questions question);
    
    public Questions getQuestionByQuestionId(int questionId);
    
    public List<Questions> getQuestionsByUsersId(int userId);             
}
