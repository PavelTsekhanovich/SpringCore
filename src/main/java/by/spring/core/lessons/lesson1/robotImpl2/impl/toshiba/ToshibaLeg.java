package by.spring.core.lessons.lesson1.robotImpl2.impl.toshiba;

import by.spring.core.lessons.lesson1.robotImpl2.interfaces.Leg;

public class ToshibaLeg implements Leg {

    @Override
    public void go() {
        System.out.println("Go to Toshiba!");
    }

}
