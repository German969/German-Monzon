package com.mycompany.app.Proxy;

public class ProxyPatternDemo {

  public static void main(String[] args) {
    DBConnection dbConnection = new ProxyDBConnection("127.0.0.1", 2306, "admin", "1234");

    //image will be loaded from disk
    dbConnection.connect();
    System.out.println("");

    //image will not be loaded from disk
    dbConnection.connect();
  }

}
