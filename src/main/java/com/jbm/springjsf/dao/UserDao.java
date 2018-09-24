/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jbm.springjsf.dao;

import com.jbm.springjsf.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author astan
 */
@Repository
public class UserDao {
    public User findUser(User user){
        System.out.println("findUser");
        
        if(user.getUsername().equals("John")){
            User foundUser = new User();
            foundUser.setUsername(user.getUsername());
            foundUser.setPassword(user.getPassword());
            return foundUser;
        }
        
        return null;
    }
}
