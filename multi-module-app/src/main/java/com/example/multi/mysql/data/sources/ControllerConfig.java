package com.example.multi.mysql.data.sources;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.example.multi.mysql.data.sources.module1.jpa.JpaModule1Config;
import com.example.multi.mysql.data.sources.module2.jpa.JpaModule2Config;

@Configuration
@Import({JpaModule1Config.class, JpaModule2Config.class})
public class ControllerConfig {}
