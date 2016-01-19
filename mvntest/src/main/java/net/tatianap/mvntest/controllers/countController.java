/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.controllers;

import java.util.Map;
import java.util.Set;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.tatianap.mvntest.dao.HibernateUtil;
import net.tatianap.mvntest.dao.ProjectDAOImpl;
import net.tatianap.mvntest.dao.TaskDAOImpl;
import net.tatianap.mvntest.dao.UserDAOImpl;
import net.tatianap.mvntest.domain.RegBean;
import net.tatianap.mvntest.domain.User;
import net.tatianap.mvntest.service.ProjectService;
import net.tatianap.mvntest.service.TaskService;
import net.tatianap.mvntest.service.UserServi;
import net.tatianap.mvntest.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Tatiana
 */
@Controller
//@Scope("session")
@SessionAttributes(types = User.class)
public class countController {

   @Autowired
    @Qualifier(value="userService")
	public UserService userService;
   @Autowired
    @Qualifier(value="projectService")
	public ProjectService projectService;
   @Autowired
    @Qualifier(value="taskService")
	public TaskService taskService;


   // private UserService userService=new UserService();
    
    @RequestMapping(value = "/index")
    public String listUsers(Map<String, Object> map) {
        map.put("users", userService.listUsers());
       map.put("ses_user", userService.getUserByID(3));
      
        return "index";
    }
    
    //@Resource(name="userService")
	//private UserService userService;
    
   /* @RequestMapping(value = "/login")
    public String executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")RegBean loginBean) 
    {
       if(!userService.login(loginBean))
             return "error"; 
         request.setAttribute("loggedInUser", loginBean.getUsername());
         request.setAttribute("type", loginBean.getType());
        
        return "welcome";
    } */
//    
//        @RequestMapping(value = "/registration", method = RequestMethod.GET)
//        public String getPersons(Model model) {
//        return "registration";
//    }
//        
//        @RequestMapping(value = "/registration", method = RequestMethod.POST)
//        public String executeReg (HttpServletRequest request, HttpServletResponse response, @ModelAttribute("regBean")RegBean regBean ) {
//        //userService.add(regBean);
//        return "regsucces";
//        } 
//      
//    @RequestMapping(value = "/login")
//    public String user(Map<String, Object> map, @PathVariable("id") Integer id) {
//       map.put("ses_user", userDao.getUserByID(1)); 
//       return "work";
//    }
    
    @RequestMapping(value = "/work/{id}")
    public String work(Map<String, Object> map, @PathVariable("id") Integer id) {
       map.put("projects", projectService.getProjectByModId(id)); 
       return "work";
    }
    
    @RequestMapping(value = "/project/{id}")
    public String proj(Map<String, Object> map, @PathVariable("id") Integer id) {
       // map.put("ses_user", userDao.getUserByID(3));
        map.put("project", projectService.getProjectByID(id)); 
        return "project";
    }

    @RequestMapping(value = "/close/{id}")
    public String proj_set(Map<String, Object> map, @PathVariable("id") Integer id) {
        projectService.updateProject(id);
        return "redirect:../project/" + id;
    }

    @RequestMapping(value = "/task/{id}")
    public String task(Map<String, Object> map, @PathVariable("id") Integer id) {
        map.put("task", taskService.getTaskByID(id));
        return "task";
    }

    @RequestMapping(value = "/accept/{id}")
    public String task_accept(Map<String, Object> map, @PathVariable("id") Integer id) {
        taskService.acceptTask(id);
        return "redirect:../task/" + id;
    }
    @RequestMapping(value = "/deny/{id}")
    public String task_deny(Map<String, Object> map, @PathVariable("id") Integer id) {
        taskService.denyTask(id);
        return "redirect:../task/" + id;
    }
    
}
