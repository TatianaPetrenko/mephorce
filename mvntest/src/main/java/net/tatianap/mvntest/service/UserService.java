/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.service;

import java.util.List;
import net.tatianap.mvntest.domain.User;

/**
 *
 * @author Tatiana
 */

public interface UserService {

    public User getUserByID(int id);

    public List<User> listUsers();

    public void add(User quest);

    public Integer login(User user);
}
