package by.spring.core.lessons.lesson2.impls.sony;

import by.spring.core.lessons.lesson2.interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething(){
        System.out.println("Catched from Sony!!");
    }

}
