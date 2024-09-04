package com.Usine.state.tcp_connection;

// State -->

public interface TCPState {

    void open();
    void close();
    void acknowledge();

    default void getSimpleName(){
        System.out.print(this.getClass().getSimpleName());
    }
}
