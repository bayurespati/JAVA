package Chapter_10;

import Chapter_10.library_class_chapter_10.MyPoint;

/**
 * Created by bnamora on 2/16/17.
 */
public class ex_4_ch_10_the_myPoint_class {
    public static void main(String[] args) {
        MyPoint Obj1 = new MyPoint();
        MyPoint Obj2 = new MyPoint(10,30.5);
        double distanceTwoObject = Obj1.distance(Obj2);
        System.out.println("Distance Two object is : "+distanceTwoObject);
    }
}
