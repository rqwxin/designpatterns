package com.cgx.state2;


import com.cgx.state1.State;

public class SmallMario implements IMario{


    private MarioState marioState;

    public SmallMario( MarioState marioState){
        this.marioState = marioState;
    }

    @Override
    public State getState() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        marioState.setState(new SuperMario(marioState));
        marioState.setScore(marioState.getScore() + 100);
    }

    @Override
    public void meetMonster() {
        marioState.setState(new SmallMario(marioState));
        marioState.setScore(marioState.getScore() -100);
    }

    @Override
    public void obtainFireFlower() {
        marioState.setState(new FirelMario(marioState));
        marioState.setScore(marioState.getScore() + 300);
    }

    @Override
    public void obtainCape() {
        marioState.setState(new CapeMario(marioState));
        marioState.setScore(marioState.getScore() + 200);
    }
}
