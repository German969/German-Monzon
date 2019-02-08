package com.mycompany.app.Singleton;

public class DBConnection {

  private static DBConnection instance = new DBConnection();

  private static String host;
  private static int port;
  private static String user;
  private static String password;

  private DBConnection(){}

  public static DBConnection getInstance(){
    return instance;
  }

  public void setHost(String host){
    DBConnection.host = host;
  }

  public static String getHost() {
    return host;
  }

  public void setPort(int port){
    DBConnection.port = port;
  }

  public static int getPort() {
    return port;
  }

  public void setUser(String user){
    DBConnection.user = user;
  }

  public static String getUser() {
    return user;
  }

  public void setPassword(String password){
    DBConnection.password = password;
  }

  public static String getPassword() {
    return password;
  }

}
