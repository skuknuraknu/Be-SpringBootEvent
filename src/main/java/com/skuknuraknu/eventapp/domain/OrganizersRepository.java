package com.skuknuraknu.eventapp.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path = "organizers")
public interface OrganizersRepository extends CrudRepository<Organizers, Long> {
    List<Organizers> findByName(String name);
}