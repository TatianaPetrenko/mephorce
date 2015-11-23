/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

import java.util.List;
import net.tatianap.mvntest.domain.User;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tatiana
 */
@Service
public class UserDAOImpl implements UserDAO {


    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public User getUserByID(int id) {
        //   Session ses = sessionFactory.getCurrentSession();
        User usr = null;

        try {

            usr = (User) sessionFactory.getCurrentSession().get(User.class, id);

        } catch (Exception e) {
            System.out.println("РњР°РјР°, СЏ СѓРїР°Р», С‡С‚Рѕ СЃ Р±Р°Р·РѕР№?");

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
}
