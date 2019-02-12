package com.mycompany.app.Proxy;

public class ProxyDBConnection implements DBConnection {

  private RealDBConnection realDBConnection;
  private String host;
  private int port;
  private String user;
  private String password;

  public ProxyDBConnection(String host, int port, String user, String password) {
    this.host = host;
    this.port = port;
    this.user = user;
    this.password = password;
  }

  @Override
  public void connect() {
    if (realDBConnection == null) {
      realDBConnection = new RealDBConnection(this.host, this.port, this.user, this.password);
    }
    realDBConnection.connect();
  }
}
