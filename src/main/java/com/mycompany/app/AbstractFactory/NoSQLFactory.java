package com.mycompany.app.AbstractFactory;

public class NoSQLFactory extends AbstractFactory {

  @Override
  DBConnection getDBConnection(String dbType) {
    if (dbType.equalsIgnoreCase("MongoDB")) {
      return new MongoDB();
    } else if (dbType.equalsIgnoreCase("Redis")) {
      return new Redis();
    }
    return null;
  }
}
