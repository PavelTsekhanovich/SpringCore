package by.spring.core.lessons.lesson2.impls.robot;

import by.spring.core.lessons.lesson2.interfaces.Hand;
import by.spring.core.lessons.lesson2.interfaces.Head;
import by.spring.core.lessons.lesson2.interfaces.Leg;
import by.spring.core.lessons.lesson2.interfaces.Robot;

public class ModelT1000 implements Robot{

    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.print("T1000 is dancing!");
    }
}
