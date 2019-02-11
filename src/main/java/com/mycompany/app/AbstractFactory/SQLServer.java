package com.mycompany.app.AbstractFactory;

public class SQLServer implements DBConnection {

  @Override
  public void connect() {
    System.out.println("Connected to SQL Server");
  }
}
