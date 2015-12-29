/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.dao;

import java.util.List;
import net.tatianap.mvntest.domain.Project;

/**
 *
 * @author Tatiana
 */
public interface ProjectDAO {

    public Project getProjectByID(int id);

    public void updateProject(int id);

    public List<Project> getProjectByModId(int id);
}
