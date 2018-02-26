package com.example.multi.mysql.data.sources.module1.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.multi.mysql.data.sources.module1.Module1;

public class JpaModule1 implements Module1 {

  @Autowired
  FooRepository fooRepository;
  
  @Override
  public void doSomething() {
    // do something, anything, with the repository
    fooRepository.findAll();
  }
  

}
