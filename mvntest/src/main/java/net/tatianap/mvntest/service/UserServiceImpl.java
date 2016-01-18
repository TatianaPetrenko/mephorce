/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.service;

import net.tatianap.mvntest.dao.*;
import java.util.List;
import net.tatianap.mvntest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tatiana
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    @Transactional
    @Override
    public User getUserByID(int id) {
        return userDao.getUserByID(id);
    }

    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

 
    @Transactional
    @Override
    public void add(User quest) {
        userDao.add(quest);
    }
    @Transactional
    @Override
    public Integer login(User user) {
      return userDao.login(user);
    }
}
