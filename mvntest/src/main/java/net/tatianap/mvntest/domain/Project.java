/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Tatiana
 */
@Entity //соответствует записи в базе
@Table(name = "projects") 
public class Project implements Serializable {
    @Id @GeneratedValue //следующая переменная соответствует первичному ключу, генерируемая
   @Column(name = "id") // соответсвует колонке id; далее так же
     private Integer id;   
@Column(name = "description")
    private String description;
   @Column(name = "pr_conditions")
    private String conds;
   private Set<User> users;
    
     public Project() {
    }
   
      public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
      public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }
    
    @ManyToMany(mappedBy = "projects")
      public Set<User> getPRUsers() {
        return users;
    }

    public void setPRUsers(Set<User> users) {
        this.users = users;
    }
    
      public String getConds() {
        return conds;
    }

    public void setConds(String conds) {
        this.conds = conds;
    }
    
    
}
