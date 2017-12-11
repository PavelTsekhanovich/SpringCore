package by.spring.core.lessons.lesson1.robotImpl2.start;

import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Hand;
import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Head;
import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Leg;

public class Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public Robot(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
