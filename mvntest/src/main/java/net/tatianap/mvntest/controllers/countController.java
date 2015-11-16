/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.controllers;

import java.util.List;
import net.tatianap.mvntest.domain.User;
import net.tatianap.mvntest.dao.UserDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tatiana
 */
@Controller
public class countController {
    UserDAOImpl usrserv = new UserDAOImpl();
    List<User> usrlst = usrserv.listUsers();

    @RequestMapping("/index.html")
 public ModelAndView listUsers() {
    return new ModelAndView("WEB-INF/jsp/counter.jsp", "users", usrlst);
 }
}
