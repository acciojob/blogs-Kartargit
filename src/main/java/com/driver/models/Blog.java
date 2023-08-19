package com.driver.models;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;
    private String title;
    private String content;
    @CreationTimestamp
    private Date publishDate;

    @ManyToOne
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "images",cascade = CascadeType.ALL)
    private List<Image> imageList = new ArrayList<>();


    public Blog(Integer id,String title,String content,Date date,User user,List<Image> imageList){
        this.blogId = id;
        this.title = title;
        this.content = content;
        this.publishDate = date;
        this.user = user;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public Integer getBlogId() {
        return this.blogId;
    }


}