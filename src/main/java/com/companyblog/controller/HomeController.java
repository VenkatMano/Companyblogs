/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyblog.controller;

/**
 *
 * @author Venkatesh
 */
import com.companyblog.data.dao.inter.IUsersDao;
import com.companyblog.data.model.Users;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    IUsersDao usersDaoImpl;
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homeView(Principal principal, HttpSession session) {
        Map<String, Object> userDetails = (Map<String, Object>) ((OAuth2Authentication) principal).getUserAuthentication().getDetails();
        Map<String, String> userDetailsMap = new LinkedHashMap<>();
        userDetailsMap.put("name", (String) userDetails.get("name"));
        userDetailsMap.put("email", (String) userDetails.get("email"));        
        session.setAttribute("userName", userDetailsMap.get("name"));
        session.setAttribute("email", userDetailsMap.get("email"));
        Users existingUser = usersDaoImpl.getUserUsingEmailId(userDetailsMap.get("email"));
        if(existingUser ==null)
        {
          Users user = new Users();
          user.setEmail(userDetailsMap.get("email"));
          usersDaoImpl.saveUser(user);
        }
        return new ModelAndView("home").addObject("userName",session.getAttribute("userName") );
    }

}
