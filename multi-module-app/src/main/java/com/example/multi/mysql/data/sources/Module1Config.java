package com.example.multi.mysql.data.sources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.example.multi.mysql.data.sources.module1.Module1;
import com.example.multi.mysql.data.sources.module1.jpa.JpaModule1;
import com.example.multi.mysql.data.sources.module1.jpa.JpaModule1Config;

@Configuration
@Import({JpaModule1Config.class})
public class Module1Config {

  @Bean
  public Module1 module1() {
    return new JpaModule1();
  }

}
