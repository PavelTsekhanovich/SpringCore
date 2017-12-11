package by.spring.core.lessons.lesson2.impls.sony;

import by.spring.core.lessons.lesson2.interfaces.Leg;

public class SonyLeg implements Leg {

    @Override
    public void go(){
        System.out.println("Go to Sony!");
    }

}
