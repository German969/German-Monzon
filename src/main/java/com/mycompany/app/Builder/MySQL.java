package com.mycompany.app.Builder;

public abstract class MySQL implements DBConnection {

  @Override
  public Port port() {
    return new MySQLPort();
  }

}
