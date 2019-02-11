package com.mycompany.app.AbstractFactory;

public class AbstractFactoryPatternDemo {

  public static void main (String[] args) {
    AbstractFactory sqlFactory = FactoryProducer.getFactory(true);

    DBConnection dbConnection1 = sqlFactory.getDBConnection("SQLServer");
    dbConnection1.connect();

    DBConnection dbConnection2 = sqlFactory.getDBConnection("MySQL");
    dbConnection2.connect();

    AbstractFactory noSQLFactory = FactoryProducer.getFactory(false);

    DBConnection dbConnection3 = noSQLFactory.getDBConnection("MongoDB");
    dbConnection3.connect();

    DBConnection dbConnection4 = noSQLFactory.getDBConnection("Redis");
    dbConnection4.connect();
  }

}
