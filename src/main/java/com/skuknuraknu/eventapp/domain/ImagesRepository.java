package com.skuknuraknu.eventapp.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "images")
public interface ImagesRepository extends CrudRepository<Images, Long> {

}
