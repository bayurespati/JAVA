package Chapter_9;

import Chapter_9.libaray_class_chapter_9.Rectangle;

/**
 * Created by bnamora on 2/9/17.
 */
public class ex_1_ch_9_the_rectangle_class {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("Rectangle1 have Width : "+rectangle1.getWidth()+" Length : "+rectangle1.getLength()+" Area : "+rectangle1.getArea()
                +" Perimeter : "+rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("Rectangle2 have Width : "+rectangle2.getWidth()+" Length : "+rectangle2.getLength()+" Area : "+rectangle2.getArea()
                +" Perimeter : "+rectangle2.getPerimeter());
    }
}
