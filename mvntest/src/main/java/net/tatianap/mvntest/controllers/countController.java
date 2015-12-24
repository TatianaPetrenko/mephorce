/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.controllers;

import java.util.Map;
import java.util.Set;
import net.tatianap.mvntest.dao.HibernateUtil;
import net.tatianap.mvntest.dao.ProjectDAOImpl;
import net.tatianap.mvntest.dao.TaskDAOImpl;
import net.tatianap.mvntest.dao.UserDAOImpl;
import net.tatianap.mvntest.domain.Project;
import net.tatianap.mvntest.domain.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Tatiana
 */
@Controller
//@Scope("session")
public class countController {

    private UserDAOImpl userDao = new UserDAOImpl();
    public ProjectDAOImpl prjDao = new ProjectDAOImpl();
    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//    Session ses = sessionFactory.openSession();
    public TaskDAOImpl tsDao = new TaskDAOImpl();

    @RequestMapping(value = "/index")
    public ModelAndView listUsers() {
        return new ModelAndView("userlist", "users", userDao.listUsers());
    }

    @RequestMapping(value = "/project/{id}")
    public String proj(Map<String, Object> map, @PathVariable("id") Integer id) {
        map.put("project", prjDao.getProjectByID(id));
        return "project";
    }

    @RequestMapping(value = "/close/{id}")
    public String proj_set(Map<String, Object> map, @PathVariable("id") Integer id) {
        prjDao.updateProject(id);
        return "redirect:project/" + id;
    }

    @RequestMapping(value = "/task/{id}")
    public String task(Map<String, Object> map, @PathVariable("id") Integer id) {
        map.put("task", tsDao.getTaskByID(id));
        return "task";
    }

}
