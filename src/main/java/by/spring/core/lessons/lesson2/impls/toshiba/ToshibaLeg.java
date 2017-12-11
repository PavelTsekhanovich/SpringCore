package by.spring.core.lessons.lesson2.impls.toshiba;

import by.spring.core.lessons.lesson2.interfaces.Leg;

public class ToshibaLeg implements Leg {

    @Override
    public void go(){
        System.out.println("Go to Toshiba!");
    }

}
