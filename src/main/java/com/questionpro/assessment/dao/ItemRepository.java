package com.questionpro.assessment.dao;


import com.questionpro.assessment.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="groceryitems")
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
