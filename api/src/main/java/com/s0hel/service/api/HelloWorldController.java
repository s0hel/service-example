package com.s0hel.service.api;

import com.s0hel.service.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/")
  public String hello() {
    return "Hello World";
  }
}
