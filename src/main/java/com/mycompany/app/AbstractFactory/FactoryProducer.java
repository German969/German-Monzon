package com.mycompany.app.AbstractFactory;

public class FactoryProducer {

  public static AbstractFactory getFactory ( boolean sql) {
    if (sql) {
      return new SQLFactory();
    } else {
      return new NoSQLFactory();
    }
  }

}
