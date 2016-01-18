/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class RegBean implements Serializable {

    @Id
    @Column(name = "usr_id")
    @GeneratedValue
    private Integer id;
    @Column(name="login")
    private String username;
    @Column(name="passw")
    private String password;
    @Column(name="role")
    private String type;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

}
