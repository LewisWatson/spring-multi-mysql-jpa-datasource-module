package com.example.multi.mysql.data.sources.Module2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.multi.mysql.data.sources.module2.jpa.JpaModule2Config;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Module2ApplicationTests {

  @SpringBootApplication
  @Import(JpaModule2Config.class)
  static class TestConfiguration {
  }

  @Test
  public void contextLoads() {}

}
