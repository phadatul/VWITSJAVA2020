package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  //private AtomicLong counter = new AtomicLong();

  @GetMapping("/hello")
  public Hello getHelloWordObject() {
      Hello hello = new Hello();
      hello.setMessage("......Welcome to VWITS Folks, Best wishes from Atul..... ");
      return hello;
  }
}
