package com.mycompany.app.Builder;

public class MySQLPort implements Port {

  @Override
  public String getPort() {
    return "3306";
  }
}
