package com.cgx.state2;


import com.cgx.state1.State;

public class SuperMario  implements IMario {
    private MarioState stateMachine;

    public SuperMario(MarioState stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getState() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing...
    }

    @Override
    public void obtainCape() {
        stateMachine.setState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setState(new FirelMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        stateMachine.setState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
