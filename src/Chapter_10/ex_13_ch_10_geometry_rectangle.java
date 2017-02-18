package Chapter_10;


import Chapter_10.library_class_chapter_10.MyRectangle2D;

/**
 * Created by bnamora on 2/18/17.
 */
public class ex_13_ch_10_geometry_rectangle {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Area : "+r1.getArea());
        System.out.println("Perimeter : "+r1.getPerimeter());
        System.out.println("contain : "+r1.contain(3,-0.4));
        System.out.println("new r1 contain new rectangle : "+r1.contain(new MyRectangle2D(3, 3, 2.5, 1)));
        System.out.println("overlap "+r1.overlap(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
