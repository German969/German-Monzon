package com.mycompany.app.Builder;

public class SQLServerPort implements Port {

  @Override
  public String getPort() {
    return "1433";
  }
}
