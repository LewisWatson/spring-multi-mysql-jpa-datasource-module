package com.example.multi.mysql.data.sources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.multi.mysql.data.sources.module1.Module1;
import com.example.multi.mysql.data.sources.module1.jpa.JpaModule1;
import com.example.multi.mysql.data.sources.module2.Module2;
import com.example.multi.mysql.data.sources.module2.jpa.JpaModule2;

@Configuration
public class ControllerConfig {
  
  @Bean
  public Module1 module1() {
    return new JpaModule1();
  }
  
  @Bean
  public Module2 module2() {
    return new JpaModule2();
  }
  
}
