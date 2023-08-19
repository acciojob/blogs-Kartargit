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
    @ManyToOne
    @JoinColumn
    private Blog blog;
    public Image(){

    }
    public Image(Integer id,String description,String dimension,Blog blog){
        this.imageId = id;
        this.description = description;
        this.dimension = dimension;
        this.blog = blog;
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


}