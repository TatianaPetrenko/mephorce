/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

import net.tatianap.mvntest.domain.Project;
import net.tatianap.mvntest.domain.Task;

/**
 *
 * @author Tatiana
 */
public interface TaskDAO {

    public Task getTaskByID(int id);
}
