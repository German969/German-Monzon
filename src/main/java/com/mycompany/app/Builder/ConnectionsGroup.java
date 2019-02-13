package com.mycompany.app.Builder;

import java.util.ArrayList;
import java.util.List;

public class ConnectionsGroup {

  private List<DBConnection> dbConnections = new ArrayList<DBConnection>();

  public void addConnection(DBConnection connection){
    dbConnections.add(connection);
  }

  public void showConnections(){

    for (DBConnection connection : dbConnections) {
      System.out.print("DB name : " + connection.name());
      System.out.println(", Port : " + connection.port().getPort());
    }
  }

}
