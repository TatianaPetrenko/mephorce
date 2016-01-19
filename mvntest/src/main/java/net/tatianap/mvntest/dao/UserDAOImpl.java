/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

import java.util.List;
import net.tatianap.mvntest.domain.RegBean;
import net.tatianap.mvntest.domain.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;

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
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected static Logger logger = Logger.getLogger("service");

    @Override
    public User getUserByID(int id) {
        Session ses = null;
        User usr = null;

        try {
            ses = sessionFactory.openSession();
            usr = (User) ses.get(User.class, id);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());

        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }
        }
        return usr;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        List<User> usr = null;
        Session ses = null;
        try {
            ses = sessionFactory.openSession();
            Criteria criteria = ses.createCriteria(User.class);

            usr = (List<User>) criteria.list();

        } catch (Exception e) {
            System.out.println("Мама, я упал, что с базой?");
        } finally {
            if (ses != null && ses.isOpen()) {
                ses.close();
            }

        }
        return usr;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(User quest) {
        logger.debug("Adding new quest");
        Session session = sessionFactory.getCurrentSession();
        session.save(quest);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer login(User user) {
        String hql = "FROM User E WHERE E.username = '" + user.getUsername() + "' AND E.password='" + user.getPassword() + "' AND E.role ='" + user.getRole() + "'";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<User> results = query.list();
        if (results.isEmpty()) {
            return null;
        }
        return results.get(0).getId();
    }
}
