package by.spring.core.lessons.lesson1.robotImpl2.impl.toshiba;

import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Hand;

public class ToshibaHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }

}
