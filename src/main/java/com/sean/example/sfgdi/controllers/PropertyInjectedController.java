package com.sean.example.sfgdi.controllers;

import com.sean.example.sfgdi.services.GreetingService;

/**
 * Created by IntelliJ IDEA.
 * User: sean
 * Date: 2022/06/23
 */
public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreeting(){
    return greetingService.sayGreeting();
  }
}
