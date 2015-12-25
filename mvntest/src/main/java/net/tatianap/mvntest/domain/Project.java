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
@Table(name = "projects")
public class Project implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "prj_id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "pr_conditions")
    private String conds;
    @Column(name = "status")
    private String status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usr_proj",
            joinColumns = @JoinColumn(name = "prj_id"),
            inverseJoinColumns = @JoinColumn(name = "usr_id"))
    private Set<User> users = new HashSet<>();
@OneToOne (mappedBy="project")
private Task task;


    public Project() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getConds() {
        return conds;
    }

    public void setConds(String conds) {
        this.conds = conds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

     public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    
    
}
