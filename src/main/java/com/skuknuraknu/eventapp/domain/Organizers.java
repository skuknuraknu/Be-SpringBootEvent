package com.skuknuraknu.eventapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Organizers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long id;

    @Column(name = "name", nullable = false, length = 512)
    private String name;


    public Organizers(){

    }
    public Organizers(String name){
        super();
        this.name = name;
    }
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizers")
    private List<Categories> categoriesList;

    public List<Categories> getCategoriesList(){
        return categoriesList;
    }
    public void setCategories(List<Categories> categoriesList){
        this.categoriesList = categoriesList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
