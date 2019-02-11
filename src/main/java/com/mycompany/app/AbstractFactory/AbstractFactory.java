package com.mycompany.app.AbstractFactory;

public abstract class AbstractFactory {

  abstract DBConnection getDBConnection(String dbType);

}
