package com.mycompany.app.Builder;

public class BuilderPatternDemo {
  public static void main(String[] args) {

    ConnectionsGroupBuilder connectionsGroupBuilder = new ConnectionsGroupBuilder();

    ConnectionsGroup appConnections1 = connectionsGroupBuilder.connectToApp1();
    System.out.println("App 1");
    appConnections1.showConnections();

    ConnectionsGroup appConnections2 = connectionsGroupBuilder.connectToApp2();
    System.out.println("App 2");
    appConnections2.showConnections();
  }
}
