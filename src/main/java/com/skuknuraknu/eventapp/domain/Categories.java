package com.skuknuraknu.eventapp.domain;

import jakarta.persistence.*;

@Entity
public class Categories {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String name;


    public Categories(){}
    public Categories(String name, Organizers organizers){
        this.name = name;
        this.organizers = organizers;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organizers")
    private Organizers organizers;

    public Organizers getOrganizers() {
        return organizers;
    }

    public void setOrganizers(Organizers organizers) {
        this.organizers = organizers;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
