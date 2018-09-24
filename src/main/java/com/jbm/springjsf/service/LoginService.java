/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jbm.springjsf.service;

import com.jbm.springjsf.dao.UserDao;
import com.jbm.springjsf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author astan
 */
@Service
public class LoginService {
    
    private static final String SUCCESS_LOGIN_MESSAGE = "Correct Login!";
    private static final String FAILED_LOGIN_MESSAGE = "Failed Login!";
    
    @Autowired
    UserDao userDao;
    
    public void loginUser(User user){
        System.out.println("loginUser");
        
        User foundUser = userDao.findUser(user);
        
        if(foundUser != null){
            user.setLoginMessage(SUCCESS_LOGIN_MESSAGE);
        } else{
            user.setLoginMessage(FAILED_LOGIN_MESSAGE);
        }
        
    }
    
}
