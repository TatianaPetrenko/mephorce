/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

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
@Repository
public class TaskDAOImpl implements TaskDAO {

 @Autowired
	private SessionFactory sessionFactory;

    
    @Override
    @SuppressWarnings("unchecked")
    public List<Task> listTasks() {
        List<Task> ts = null;
Session ses = null;
        try {
            ses = sessionFactory.openSession();
            Criteria criteria = ses.createCriteria(Task.class);

            ts = (List<Task>) criteria.list();

        } catch (Exception e) {
            System.out.println("Мама, я упал, что с базой?");
        } finally {
            if (ses != null && ses.isOpen()) {
             ses.close();
            }

        }
        return ts;
    }
    
    
    @Override
    @SuppressWarnings("unchecked")
       public Task getTaskByID(int id) {
        Session ses = null;
        Task ts = null;

        try {
            ses = sessionFactory.openSession();
            ts = (Task) ses.get(Task.class, id);

            User user;
            Project project;
            
            user = ts.getUser();
            project = ts.getProject();
            Hibernate.initialize(ts);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

            return ts;
        }
       
       }
       
         @Override
    @SuppressWarnings("unchecked")
    public void acceptTask(int id) {

        Session ses = null;
        Task ts = null;
        try {
           
            ses = sessionFactory.openSession();
            ts = (Task) ses.get(Task.class, id);
            ts.setStatus("Принято");
            ses.beginTransaction();
            ses.saveOrUpdate(ts);
            ses.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Мама, я упал, что с базой?");
            System.out.println(e.getLocalizedMessage());
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

        }
    }
       
      @Override
    @SuppressWarnings("unchecked")
    public void denyTask(int id) {

        Session ses = null;
        Task ts = null;
        try {
           
            ses = sessionFactory.openSession();
            ts = (Task) ses.get(Task.class, id);
            ts.setStatus("Отклонено");
            ses.beginTransaction();
            ses.saveOrUpdate(ts);
            ses.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Мама, я упал, что с базой?");
            System.out.println(e.getLocalizedMessage());
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

        }
    }
    
}

        

