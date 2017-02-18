package Chapter_10;

import Chapter_10.library_class_chapter_10.MyPoint;
import Chapter_10.library_class_chapter_10.Triangle2d;

/**
 * Created by bnamora on 2/17/17.
 */
public class ex_12_ch_10_geometry_the_triangle_2D {
    public static void main(String[] args) {
        Triangle2d t1 = new Triangle2d(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println(t1.contains(new MyPoint(3,3)));
        System.out.println(t1.contains(new Triangle2d(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println(t1.overlaps(new Triangle2d(new MyPoint(2, 5.5), new MyPoint(4, -3),new MyPoint(2, 6.5))));

        System.out.println("T2");
        Triangle2d t2 = new Triangle2d(new MyPoint(0, 0), new MyPoint(4, 4), new MyPoint(8,0));
        System.out.println(t2.contains(new MyPoint(2,2)));
        System.out.println(t2.contains(new Triangle2d(new MyPoint(2, 1), new MyPoint(4, 3), new MyPoint(6, 1))));
        System.out.println(t2.overlaps(new Triangle2d(new MyPoint(-10, 0), new MyPoint(-5, 5),new MyPoint(-2, 0))));
    }
}