package com.driver.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    public User(String userName,String password){
        this.userName = userName;
        this.password = password;
        this.lastName = "test";
        this.firstName = "test";
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Blog> blogList = new ArrayList<>();
}