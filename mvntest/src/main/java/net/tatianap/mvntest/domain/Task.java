/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Tatiana
 */
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue
    @Column(name = "tsk_id")
    private Integer id;
    @Column(name = "status")
    private String status;
 
@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usr_id")
    private User user;
   
@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prj_id")
    private Project project;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
