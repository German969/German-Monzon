package com.mycompany.app.Singleton;

public class DBConnectionDemo {

  public static void main(String[] args) {

    DBConnection object = DBConnection.getInstance();

    object.setHost("localhost");
    object.setPort(221);
    object.setUser("admin");
    object.setPassword("1234");

    String serverInfo = "host: " + object.getHost() + ", port: " + object.getPort();
    String userInfo = "user: " + object.getUser() + ", password: " + object.getPassword();

    System.out.println(serverInfo);
    System.out.println(userInfo);
  }

}
