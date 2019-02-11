package com.mycompany.app.AbstractFactory;

public class Redis implements DBConnection {

  @Override
  public void connect() {
    System.out.println("Connected to Redis");
  }
}
