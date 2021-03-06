package ru.foodfight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @Column(name = "is_admin",nullable = false)
    private Integer isAdmin;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    public User() {
    }

    public User(Integer id, Integer isAdmin, String name, String password) {
        super(id);
        this.isAdmin = isAdmin;
        this.name = name;
    }

    public User(User user) {
        this(user.getId(), user.getIsAdmin(), user.getName(), user.getPassword());
    }


    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String toString() {
        return "User{id=" + id + ", name=" + name + ", isAdmin=" + isAdmin + "}";
    }
}
