package com.example.multi.mysql.data.sources.module2.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.multi.mysql.data.sources.module2.Module2;

public class JpaModule2 implements Module2 {
  
  @Autowired
  FooRepository fooRepository;

  @Override
  public void doSomethineElse() {
    fooRepository.findAll();
  }

}
