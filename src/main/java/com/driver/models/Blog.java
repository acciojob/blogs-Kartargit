package com.driver.models;

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
    private Date publishDate;

    public void setTitle(String title) {
        this.title = title;
    }
    public Blog(String title,String content){
        this.title = title;
        this.content = content;
        this.publishDate = new Date();
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
    @ManyToOne
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "images",cascade = CascadeType.ALL)
    private List<Image> imageList = new ArrayList<>();

}