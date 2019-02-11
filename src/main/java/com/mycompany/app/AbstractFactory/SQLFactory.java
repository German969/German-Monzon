package com.mycompany.app.AbstractFactory;

public class SQLFactory extends AbstractFactory {

  @Override
  DBConnection getDBConnection(String dbType) {
    if (dbType.equalsIgnoreCase("SQLServer")) {
      return new SQLServer();
    } else if (dbType.equalsIgnoreCase("MySQL")) {
      return new MySQL();
    }
    return null;
  }
}
