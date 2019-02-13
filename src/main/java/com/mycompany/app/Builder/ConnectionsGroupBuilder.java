package com.mycompany.app.Builder;

public class ConnectionsGroupBuilder {

  public ConnectionsGroup connectToApp1 (){

    ConnectionsGroup connectionsGroup = new ConnectionsGroup();

    connectionsGroup.addConnection(new MySQLDB1());
    connectionsGroup.addConnection(new SQLServerDB1());

    return connectionsGroup;
  }

  public ConnectionsGroup connectToApp2 (){

    ConnectionsGroup connectionsGroup = new ConnectionsGroup();

    connectionsGroup.addConnection(new MySQLDB2());
    connectionsGroup.addConnection(new SQLServerDB2());

    return connectionsGroup;
  }

}
