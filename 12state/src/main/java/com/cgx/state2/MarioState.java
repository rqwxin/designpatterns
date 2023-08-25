package com.cgx.state2;

import lombok.Data;

@Data
public class MarioState  {
    private int score;

    private IMario state;

    public MarioState(){
        this.score=0;
        this.state = new SmallMario(this);
    }

    public void obtainMushRoom() {
        state.obtainMushRoom();
    }

    public void obtainCape() {
        state.obtainCape();
    }

    public void obtainFireFlower() {
        state.obtainFireFlower();
    }

    public void meetMonster() {
        state.meetMonster();
    }
}
