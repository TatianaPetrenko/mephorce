/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.controllers;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import net.tatianap.mvntest.dao.HibernateUtil;
import net.tatianap.mvntest.dao.UserDAO;
import net.tatianap.mvntest.domain.User;
import net.tatianap.mvntest.dao.UserDAOImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tatiana
 */
@Controller
public class countController {

    private UserDAOImpl userDao = new UserDAOImpl();

    @RequestMapping(value = "/index.html")
    public ModelAndView listUsers() {
        return new ModelAndView("counter", "users", userDao.listUsers());
    }

}
