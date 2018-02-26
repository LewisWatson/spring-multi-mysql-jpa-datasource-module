package com.example.multi.mysql.data.sources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import com.example.multi.mysql.data.sources.module1.Module1;
import com.example.multi.mysql.data.sources.module2.Module2;

@RestController
@RequestMapping(path = "/")
public class Controller {

//  @Autowired
//  private Module1 module1;

  @Autowired
  private Module2 module2;

  @RequestMapping(method = RequestMethod.POST, produces = "application/json")
  void post(@RequestBody Integer request) {
//    module1.doSomething();
    module2.doSomethineElse();
  }
}
