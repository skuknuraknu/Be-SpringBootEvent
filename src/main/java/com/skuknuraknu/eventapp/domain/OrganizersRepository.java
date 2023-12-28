package com.skuknuraknu.eventapp.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizersRepository extends CrudRepository<Organizers, Long> {
    List<Organizers> findByName(String name);
}