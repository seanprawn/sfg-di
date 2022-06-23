package com.sean.example.sfgdi.services;

import com.sean.example.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();

    controller.greetingService = new GreetingServiceImpl();
  }

  @Test
  void sayGreeting() {
    System.out.println(controller.getGreeting());

  }
}