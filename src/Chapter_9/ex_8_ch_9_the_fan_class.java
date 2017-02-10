package Chapter_9;

import Chapter_9.libaray_class_chapter_9.Fan;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_8_ch_9_the_fan_class {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOn();
        System.out.println("Fan1 = "+fan1.toString());

        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.turnOFF();
        System.out.println("fan2 = "+fan2.toString());
    }
}
