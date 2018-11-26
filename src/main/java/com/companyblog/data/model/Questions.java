package com.companyblog.data.model;
// Generated Nov 26, 2018 9:37:50 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Questions generated by hbm2java
 */
@Entity
@Table(name="questions"
    ,catalog="companyblog"
)
public class Questions  implements java.io.Serializable {


     private Integer id;
     private Users users;
     private String topic;
     private Set answerses = new HashSet(0);

    public Questions() {
    }

	
    public Questions(Users users) {
        this.users = users;
    }
    public Questions(Users users, String topic, Set answerses) {
       this.users = users;
       this.topic = topic;
       this.answerses = answerses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UserId", nullable=false)
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    
    @Column(name="Topic", length=70)
    public String getTopic() {
        return this.topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="questions")
    public Set getAnswerses() {
        return this.answerses;
    }
    
    public void setAnswerses(Set answerses) {
        this.answerses = answerses;
    }




}


