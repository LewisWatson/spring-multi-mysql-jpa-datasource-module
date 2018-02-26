package com.example.multi.mysql.data.sources.module2.jpa;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.example.multi.mysql.data.sources.module2.Module2;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.multi.mysql.data.sources.module2.jpa"})
@EnableJpaRepositories(basePackages = {"com.example.multi.mysql.data.sources.module2.jpa"})
@EnableTransactionManagement
public class JpaModule2Config {

  @Bean
  public Module2 module2() {
    return new JpaModule2();
  }

}
