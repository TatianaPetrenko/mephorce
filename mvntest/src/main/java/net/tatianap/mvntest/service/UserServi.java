package net.tatianap.mvntest.service;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import net.tatianap.mvntest.domain.RegBean;
import org.springframework.stereotype.Component;

/**
 * Service for processing Persons
 *
 */
@Component
@Transactional
public class UserServi {

//    protected static Logger logger = Logger.getLogger("service");
//
//    @Resource(name = "sessionFactory")
//    private SessionFactory sessionFactory;
//
//    public List<RegBean> getAll() {
//        logger.debug("Retrieving all question");
//        Session session = sessionFactory.getCurrentSession();
//        Query query = session.createQuery("FROM  UserTable");
//        return query.list();
//    }
//
//    public RegBean get(Integer id) {
//        Session session = sessionFactory.getCurrentSession();
//
//        RegBean quest = (RegBean) session.get(RegBean.class, id);
//
//        return quest;
//    }
//
//    public void add(RegBean quest) {
//        logger.debug("Adding new quest");
//        Session session = sessionFactory.getCurrentSession();
//        session.save(quest);
//    }
//
//    public void delete(Integer id) {
//        logger.debug("Deleting existing question");
//
//        Session session = sessionFactory.getCurrentSession();
//
//        RegBean quest = (RegBean) session.get(RegBean.class, id);
//
//        session.delete(quest);
//    }
//
//    public boolean login(RegBean user) {
//        String hql = "FROM RegBean E WHERE E.username = '"+user.getUsername()+"' AND E.password='"+user.getPassword()+"' AND E.type ='"+user.getType()+"'";
//        Query query = sessionFactory.getCurrentSession().createQuery(hql);
//        List results = query.list();
//        if(results.isEmpty())
//            return false;
//        return true;
//    }

}
