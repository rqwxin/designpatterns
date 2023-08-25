package com.cgx.state2;


import com.cgx.state1.State;

public class FirelMario implements IMario{


    private MarioState marioState;

    public FirelMario(MarioState marioState){
        this.marioState = marioState;
    }

    @Override
    public State getState() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {
        marioState.setState(new SuperMario(marioState));
        marioState.setScore(marioState.getScore() + 100);
    }

    @Override
    public void meetMonster() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void obtainCape() {

    }
}
