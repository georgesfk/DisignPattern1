package com.Usine.state.gumball_machine;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
