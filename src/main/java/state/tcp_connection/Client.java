package com.Usine.state.tcp_connection;

public class Client {

    public static void main(String[] args) {

        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.open();
        tcpConnection.acknowledge();
        tcpConnection.close();


    }
}
