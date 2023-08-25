package com.cgx.state2;

public class StateDemo2 {
    public static void main(String[] args) {
        MarioState mario = new MarioState();
        mario.obtainMushRoom();

        System.out.println("mario toString: "+mario.toString());
        mario.obtainFireFlower();
        System.out.println("mario toString: "+mario.toString());
    }
}
