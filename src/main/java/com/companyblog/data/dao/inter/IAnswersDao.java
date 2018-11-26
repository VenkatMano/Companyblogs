/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.inter;

import com.companyblog.data.model.Answers;
import java.util.List;

/**
 *
 * @author Venkatesh
 */
public interface IAnswersDao {
    
    public boolean saveAnswer(Answers answer);
    
    public boolean deleteAnswer(Answers answer);
    
    public boolean updateAnswer(Answers answer);
    
    public List<Answers> getAnswersByQuestionId(int questionId);
    
}
