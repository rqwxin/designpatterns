package com.cgx.state1;

public class StateDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
        mario.obtainFireFlower();
        System.out.println("mario toString: "+mario.toString());
    }
}
