package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;
@RestController
public class HelloWebClientController {
  @Autowired
  private DiscoveryClient discoveryClient;

  @GetMapping("/")
  public String handleRequest(Model model) {
	  String temp="";
      //accessing hello-service
      List<ServiceInstance> instances = discoveryClient.getInstances("hello-service");
      if (instances != null && instances.size() > 0) {//todo: replace with a load balancing mechanism
          ServiceInstance serviceInstance = instances.get(0);
          String url = serviceInstance.getUri().toString();
          System.out.println(url);
          url = url + "/hello";
          RestTemplate restTemplate = new RestTemplate();
          Hello helloObject = restTemplate.getForObject(url,Hello.class);
          model.addAttribute("msg", helloObject.getMessage());
          model.addAttribute("time", LocalDateTime.now());
          temp=helloObject.getMessage()+" : "+LocalDateTime.now();
      }
      return "hello-page : "+temp;
  }
}