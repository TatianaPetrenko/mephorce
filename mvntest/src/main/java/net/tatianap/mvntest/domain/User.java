/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Tatiana
 */
@Entity //соответствует записи в базе
@Table(name = "users") //в таблице users
public class User implements Serializable {

    @Column(name = "usr_id")
    @Id
    private Integer id;
    @Column(name = "rate")
    private Integer rate;
    @Column(name = "name")
    private String name;
    @Column(name = "role")
    private String role;

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private Set<Project> projects = new HashSet<>();
@OneToOne (mappedBy="user")
private Task task;

//    private Task task;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

//    public Task getTask() {
//        return task;
//    }
//
//    public void setTask(Task task) {
//        this.task = task;
//    }

}
