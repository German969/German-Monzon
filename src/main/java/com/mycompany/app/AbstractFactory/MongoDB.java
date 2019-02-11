package com.mycompany.app.AbstractFactory;

public class MongoDB implements DBConnection {

  @Override
  public void connect() {
    System.out.println("Connected to MongoDB");
  }
}
