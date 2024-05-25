package com.questionpro.assessment.dao;


import com.questionpro.assessment.entity.InventoryItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="items")
public interface ItemRepository extends JpaRepository<InventoryItems,Integer> {
}
