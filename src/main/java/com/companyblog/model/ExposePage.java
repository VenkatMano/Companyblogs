/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.model;

/**
 *
 * @author Venkatesh
 */
public class ExposePage {

    private String domainChoosen;
    private String questionTitle;
    private String questionDescription;

    public void setDomainChoosen(String domainChoosen) {
        this.domainChoosen = domainChoosen;
    }

    public String getDomainChoosen() {
        return domainChoosen;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }
}
