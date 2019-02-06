package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class GreetingTest {

  String mockFirstName = "German";
  String mockSecondName = "Agustin";
  String mockGreet = "Hello " + mockFirstName + "!";
  String mockFarewell = "Bye " + mockFirstName + "!";

  Greeting myGreeting = new Greeting(mockFirstName);

  @Test
  public void getName() {
    assertEquals(myGreeting.getName(),mockFirstName);
  }

  @Test
  public void setName() {
    myGreeting.setName(mockSecondName);
    assertEquals(myGreeting.getName(),mockSecondName);
    myGreeting.setName(mockFirstName);
  }

  @Test
  public void sayHi() {
    assertEquals(myGreeting.sayHi(),mockGreet);
  }

  @Ignore
  @Test
  public void sayBye() {
    assertEquals(myGreeting.sayBye(),mockFarewell);
  }

}
