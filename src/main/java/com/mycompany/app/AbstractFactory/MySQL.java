package com.mycompany.app.AbstractFactory;

public class MySQL implements DBConnection {

  @Override
  public void connect() {
    System.out.println("Connected to MySQL");
  }
}
