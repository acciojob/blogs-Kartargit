package com.driver.models;

import javax.persistence.*;

@Entity
@Table
public class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imageId;
    private String description;
    private String dimension;
    public Image(String description,String dimension){
        this.description = description;
        this.dimension = dimension;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getDimension() {
        return dimension;
    }

    public Integer getImageId() {
        return this.imageId;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Blog getBlog() {
        return blog;
    }

    @ManyToOne
    @JoinColumn
    private Blog blog;
}