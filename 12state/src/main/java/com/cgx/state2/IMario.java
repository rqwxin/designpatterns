package com.cgx.state2;


import com.cgx.state1.State;

public interface IMario {
    default State getState(){
        return State.SMALL;
    }
    //
//    void obtainMushRoom(MarioState marioState);
//
//     void meetMonster(MarioState marioState);
//
//     void obtainFireFlower(MarioState marioState);
//
//     void obtainCape(MarioState marioState);

    //
    void obtainMushRoom();

    void meetMonster();

    void obtainFireFlower();

    void obtainCape();
}
