package com.example.multi.mysql.data.sources.module1.jpa;

import org.springframework.data.repository.CrudRepository;

public interface SpatialFooRepository extends CrudRepository<JpaFoo, Long> {
  
}
