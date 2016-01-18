/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.service;

import net.tatianap.mvntest.dao.*;
import java.util.List;
import java.util.Set;
import net.tatianap.mvntest.domain.Project;
import net.tatianap.mvntest.domain.Task;
import net.tatianap.mvntest.domain.User;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tatiana
 */
@Service("taskService")
@Transactional
public class TaskServiceImpl implements TaskService {
    
    @Autowired
    private TaskDAO taskDao;
    
     @Transactional
    public List<Task> listTasks() {
        return taskDao.listTasks();
    }
    
     @Transactional
    public Task getTaskByID(int id) {
        return taskDao.getTaskByID(id);
        
    }
    
     @Transactional
    public void acceptTask(int id) {
        taskDao.acceptTask(id);
        
    }
    
   @Transactional
    public void denyTask(int id) {
        
        taskDao.denyTask(id);
    }
    
}
