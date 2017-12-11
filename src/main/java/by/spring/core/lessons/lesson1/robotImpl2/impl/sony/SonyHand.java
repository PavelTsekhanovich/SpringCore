package by.spring.core.lessons.lesson1.robotImpl2.impl.sony;

import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched from Sony!!");
    }

}