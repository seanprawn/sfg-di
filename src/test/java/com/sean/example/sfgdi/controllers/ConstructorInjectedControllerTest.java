package com.sean.example.sfgdi.controllers;

import com.sean.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  //Most preferred way
  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}