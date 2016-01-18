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
import net.tatianap.mvntest.UserServi;
import net.tatianap.mvntest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegController {
    
    @Autowired
	private UserService userService;
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getPersons(Model model) {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String executeReg (HttpServletRequest request, HttpServletResponse response, @ModelAttribute("regBean")  User regBean ) {
        userService.add(regBean);
    return "regsucces";
    } 
}