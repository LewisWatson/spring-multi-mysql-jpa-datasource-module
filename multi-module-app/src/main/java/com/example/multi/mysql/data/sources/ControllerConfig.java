package com.example.multi.mysql.data.sources;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.example.multi.mysql.data.sources.module1.Module1;
import com.example.multi.mysql.data.sources.module1.jpa.JpaModule1;
import com.example.multi.mysql.data.sources.module2.Module2;
import com.example.multi.mysql.data.sources.module2.jpa.JpaModule2;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.multi.mysql.data.sources.module1.jpa",
    "com.example.multi.mysql.data.sources.module2.jpa"})
@EnableJpaRepositories(basePackages = {"com.example.multi.mysql.data.sources.module1.jpa",
    "com.example.multi.mysql.data.sources.module2.jpa"})
@EnableTransactionManagement
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
