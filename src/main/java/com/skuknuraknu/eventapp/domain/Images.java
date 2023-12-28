package com.skuknuraknu.eventapp.domain;

import jakarta.persistence.*;

@Entity
public class Images {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "image", nullable = false)
    private String image;

    public Images(){}
    public Images(String image){
        this.image = image;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
