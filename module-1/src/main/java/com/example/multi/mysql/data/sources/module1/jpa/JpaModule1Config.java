package com.example.multi.mysql.data.sources.module1.jpa;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.example.multi.mysql.data.sources.module1.Module1;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.multi.mysql.data.sources.module1.jpa"})
@EnableJpaRepositories(basePackages = {"com.example.multi.mysql.data.sources.module1.jpa"})
@EnableTransactionManagement
public class JpaModule1Config {

  @Bean
  public Module1 module1() {
    return new JpaModule1();
  }

}
