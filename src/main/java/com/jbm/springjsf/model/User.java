/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jbm.springjsf.model;

import com.jbm.springjsf.service.LoginService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author astan
 */
//@javax.faces.bean.ManagedBean // JSF
//@javax.faces.bean.RequestScoped // JSF
//@org.springframework.stereotype.Component //Spring
@javax.inject.Named // CDI
@javax.enterprise.context.RequestScoped // CDI
public class User implements Serializable{
    
    private String username;
    private String password;
    
    @Autowired
    private LoginService loginService;
    
    private String loginMessage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
    }
    
    public void login(){        
        System.out.println("login: " + username + " " + password);        
        loginService.loginUser(this);
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", loginService=" + loginService + '}';
    }
}
