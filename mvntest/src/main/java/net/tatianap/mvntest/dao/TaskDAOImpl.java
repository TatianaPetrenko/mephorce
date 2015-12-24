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
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tatiana
 */
@Service
public class TaskDAOImpl implements TaskDAO {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//    private UserDAOImpl userdao = new UserDAOImpl();

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
       
}

        

