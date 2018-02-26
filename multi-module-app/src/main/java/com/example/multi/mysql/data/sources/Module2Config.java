package com.example.multi.mysql.data.sources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.example.multi.mysql.data.sources.module2.Module2;
import com.example.multi.mysql.data.sources.module2.jpa.JpaModule2;
import com.example.multi.mysql.data.sources.module2.jpa.JpaModule2Config;

@Configuration
@Import({JpaModule2Config.class})
public class Module2Config {

  @Bean
  public Module2 module2() {
    return new JpaModule2();
  }

}