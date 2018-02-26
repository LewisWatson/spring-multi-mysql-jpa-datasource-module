package com.example.multi.mysql.data.sources.Module1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.multi.mysql.data.sources.module1.jpa.JpaModule1Config;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Module1ApplicationTests {

  @SpringBootApplication
  @Import(JpaModule1Config.class)
  static class TestConfiguration {
  }

  @Test
  public void contextLoads() {}

}
