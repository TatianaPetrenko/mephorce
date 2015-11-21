/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.controllers;

import net.tatianap.mvntest.dao.HibernateUtil;
import net.tatianap.mvntest.dao.ProjectDAOImpl;
import net.tatianap.mvntest.dao.UserDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tatiana
 */
@Controller
public class countController {

    private UserDAOImpl userDao = new UserDAOImpl();
    public ProjectDAOImpl prjDao = new ProjectDAOImpl();

    @RequestMapping(value = "/index.html")
    public ModelAndView listUsers() {
        return new ModelAndView("userlist", "users", userDao.listUsers());
    }
    
    @RequestMapping(value = "/project.html")
    public ModelAndView projects() {
        return new ModelAndView("project", "project", prjDao.getProjectByID(1));
    }

}
