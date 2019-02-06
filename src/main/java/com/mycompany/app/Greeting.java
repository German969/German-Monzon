package com.mycompany.app;

public class Greeting {

  private String name;

  public Greeting(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String sayHi() {
    return ("Hello " + this.name + "!");
  }

  public String sayBye() {
    return ("Bye " + this.name + "!");
  }

}
