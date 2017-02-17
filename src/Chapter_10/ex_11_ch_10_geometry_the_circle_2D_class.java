package Chapter_10;

import Chapter_10.library_class_chapter_10.Circle2D;

/**
 * Created by bnamora on 2/17/17.
 */
public class ex_11_ch_10_geometry_the_circle_2D_class {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println(" "+c1.contains(3,3));
        System.out.println(" "+c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(" "+c1.overlap(new Circle2D(3,5,2.3)));
    }
}
