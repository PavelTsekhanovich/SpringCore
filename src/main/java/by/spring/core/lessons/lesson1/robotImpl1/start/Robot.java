package by.spring.core.lessons.lesson1.robotImpl1.start;

import by.spring.core.lessons.lesson1.robotImpl1.objects.SonyHand;
import by.spring.core.lessons.lesson1.robotImpl1.objects.SonyHead;
import by.spring.core.lessons.lesson1.robotImpl1.objects.SonyLeg;

public class Robot {

    private SonyHand hand = new SonyHand();
    private SonyLeg leg = new SonyLeg();
    private SonyHead head = new SonyHead();

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
