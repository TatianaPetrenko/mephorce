/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

import java.util.List;
import java.util.Set;
import net.tatianap.mvntest.domain.Project;
import net.tatianap.mvntest.domain.User;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tatiana
 */
@Repository
public class ProjectDAOImpl implements ProjectDAO {

@Autowired
	private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public Project getProjectByID(int id) {
        Session ses = null;
        Project pr = null;

        try {
            ses = sessionFactory.openSession();
            pr = (Project) ses.get(Project.class, id);
                   
            Set<User> users;

            users = pr.getUsers();

            Hibernate.initialize(pr);

        } catch (Exception e) {
            System.out.println("Мама, я упал, что с базой?");
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

            return pr;
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public void updateProject(int id) {

        Session ses = null;
        Project pr = null;
        try {
           
            ses = sessionFactory.openSession();
            pr = (Project) ses.get(Project.class, id);
            pr.setStatus("Сдан");
            ses.beginTransaction();
            ses.saveOrUpdate(pr);
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
    public List<Project> getProjectByModId(int id) {

        Session ses = null;
        List<Project> pr = null;
        try {

            ses = sessionFactory.openSession();
            Criteria criteria = ses.createCriteria(Project.class)
                    .createCriteria("user").add(Restrictions.eq("id", id))
            ;
            pr = criteria.list();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

        }

        return pr;
    }
}
