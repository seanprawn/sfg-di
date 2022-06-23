package com.sean.example.sfgdi.controllers;

import com.sean.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
  //Least preferred way!
  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();

    controller.greetingService = new GreetingServiceImpl();
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}