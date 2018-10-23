/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.data.dao.inter;

import com.companyblog.data.model.Users;
import java.util.List;

/**
 *
 * @author Venkatesh
 */
public interface IUsersDao {
    public boolean saveUser(Users users);
    
    public Users getUserUsingEmailId(String emailId);
    
    public List<Users> getUserList();
    
    public boolean saveOrUpdateUser(Users users);
    
    public boolean deleteUser(Users user);
                                
}
