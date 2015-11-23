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
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "pr_conditions")
    private String conds;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usr_proj",
            joinColumns = @JoinColumn(name = "prj_id"),
            inverseJoinColumns = @JoinColumn(name = "usr_id"))
    private Set<User> users = new HashSet<>();

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

}
