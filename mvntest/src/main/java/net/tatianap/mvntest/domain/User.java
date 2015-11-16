/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tatianap.mvntest.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Tatiana
 */
@Entity //соответствует записи в базе
@Table(name = "users") //в таблице users
public class User implements Serializable {
 
@Id @GeneratedValue //следующая переменная соответствует первичному ключу, генерируемая
   @Column(name = "id") // соответсвует колонке id; далее так же
     private Integer id;   
@Column(name = "rate")
    private Integer rate;
   @Column(name = "name")
    private String name;


 
  public User() {
    }

    public Integer getId() {
        return id;
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

   
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
      this.rate = rate;
  }

}
