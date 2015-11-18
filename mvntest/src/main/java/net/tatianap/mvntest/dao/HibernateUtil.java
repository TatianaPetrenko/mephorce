package net.tatianap.mvntest.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.SessionFactory;
import net.tatianap.mvntest.domain.User;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Tatiana
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
              AnnotationConfiguration aconf = new AnnotationConfiguration()
              .addAnnotatedClass(User.class);
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = aconf.configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
