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
public class ProjectDAOImpl implements ProjectDAO {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//    private UserDAOImpl userdao = new UserDAOImpl();

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
            System.out.println("РњР°РјР°, СЏ СѓРїР°Р», С‡С‚Рѕ СЃ Р±Р°Р·РѕР№?");
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

            return pr;
        }

    }

}
