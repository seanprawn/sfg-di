package com.sean.example.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: sean
 * Date: 2022/06/23
 */
@Controller
public class MyController {
  public String sayHello(){
    System.out.println("Hello world");

    return "Hi There!";
  }
}
