package com.mycompany.app.Proxy;

public class RealDBConnection implements DBConnection {

  private String host;
  private int port;
  private String user;
  private String password;

  public RealDBConnection(String host, int port, String user, String password) {
    this.host = host;
    this.port = port;
    this.user = user;
    this.password = password;

    connecting(host);
  }

  @Override
  public void connect() {
    System.out.println("Connected to " + host);
  }

  private void connecting(String host){
    System.out.println("Connecting to " + host);
  }
}
