/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.service;

import net.tatianap.mvntest.dao.*;
import java.util.List;
import java.util.Set;
import net.tatianap.mvntest.domain.Project;
import net.tatianap.mvntest.domain.User;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tatiana
 */
@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDAO projectDao;

   @Transactional
    public Project getProjectByID(int id) {
        return projectDao.getProjectByID(id);
    }

   @Transactional
    public void updateProject(int id) {
        projectDao.updateProject(id);
    }

   @Transactional
    public List<Project> getProjectByModId(int id) {

        return projectDao.getProjectByModId(id);
    }
}
