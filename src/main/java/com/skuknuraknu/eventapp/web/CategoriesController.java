package com.skuknuraknu.eventapp.web;

import com.skuknuraknu.eventapp.domain.Categories;
import com.skuknuraknu.eventapp.domain.CategoriesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
    private final CategoriesRepository categoriesRepository;

    public CategoriesController(CategoriesRepository categoriesRepository){
        this.categoriesRepository = categoriesRepository;
    }

    @GetMapping("/categories")
    public Iterable<Categories> getCars(){
        return categoriesRepository.findAll();
    }
}
