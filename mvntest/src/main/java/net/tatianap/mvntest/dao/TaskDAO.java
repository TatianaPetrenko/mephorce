/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

import java.util.List;
import net.tatianap.mvntest.domain.Project;
import net.tatianap.mvntest.domain.Task;

/**
 *
 * @author Tatiana
 */
public interface TaskDAO {

    public List<Task> listTasks();

    public Task getTaskByID(int id);

    public void acceptTask(int id);

    public void denyTask(int id);
}
