package com.example.multi.mysql.data.sources.module2.jpa;

import org.springframework.data.repository.CrudRepository;

public interface FooRepository extends CrudRepository<JpaFoo, Long> {
  
}
