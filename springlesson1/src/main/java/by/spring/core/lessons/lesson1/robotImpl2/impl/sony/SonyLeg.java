package by.spring.core.lessons.lesson1.robotImpl2.impl.sony;

import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Leg;

public class SonyLeg implements Leg {

    @Override
    public void go() {
        System.out.println("Go to Sony!");
    }
}
