package com.skuknuraknu.eventapp.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "categories")
public interface CategoriesRepository extends CrudRepository<Categories, Long> {

    List<Categories> findByName(@Param("name") String name);
}
