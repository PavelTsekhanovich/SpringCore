package by.spring.core.lessons.lesson1.robotImpl2.start;

import by.spring.core.lessons.lesson1.robotImpl2.impl.sony.SonyHand;
import by.spring.core.lessons.lesson1.robotImpl2.impl.sony.SonyHead;
import by.spring.core.lessons.lesson1.robotImpl2.impl.toshiba.ToshibaLeg;

public class RobotConstructor {

    public static void main(String[] args){

        SonyHand sonyHand = new SonyHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();
        SonyHead sonyHead = new SonyHead();

        Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);

        robot.action();
    }
}
