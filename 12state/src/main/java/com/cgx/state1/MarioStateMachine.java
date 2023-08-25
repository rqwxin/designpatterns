package com.cgx.state1;

import lombok.ToString;

@ToString
public class MarioStateMachine {

    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
            score +=100;
        switch (currentState) {
            case SMALL:
                currentState = State.SUPER;
                break;
            default:
                break;
        }
    }

    public void obtainCape() {
        score +=200;
        switch (currentState) {
            case SMALL:
            case SUPER:
                currentState = State.CAPE;
                break;
        }
    }

    public void obtainFireFlower() {
        score +=300;
        switch (currentState) {
            case SMALL:
            case SUPER:
            case FIRE:
                currentState = State.FIRE;
                break;
        }
    }

    public void meetMonster() {
        score -=100;
        currentState = State.SMALL;
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}
