package com.mycompany.app.Builder;

public abstract class SQLServer implements DBConnection {

  @Override
  public Port port() {
    return new SQLServerPort();
  }

}
