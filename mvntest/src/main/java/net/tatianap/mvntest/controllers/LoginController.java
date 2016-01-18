/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.tatianap.mvntest.domain.RegBean;
import net.tatianap.mvntest.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import net.tatianap.mvntest.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;

@Controller
public class LoginController {
 
    @Autowired
    @Qualifier(value="userService")
	public UserService userService;
    
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getPersons(Model model) {
     return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")User loginBean)
    {
         if(userService.login(loginBean) == null)
             return "error";
         request.setAttribute("loggedInUser", loginBean.getUsername());
         request.setAttribute("type", loginBean.getRole());
         return "redirect:/work/" + userService.login(loginBean);
    }
    
 }
