package Chapter_11;

import Chapter_11.library_class_chapter_11.CircleFromSimpleGeometricObject;
import Chapter_11.library_class_chapter_11.RectangleFromSimpleGeometricObject;

/**
 * Created by bnamora on 2/23/17.
 */
public class eg_4_ch_11_test_circle_rectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);

        System.out.println("A circle "+circle.toString());
        System.out.println("The color is "+circle.getColor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The diameter is "+circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);

        System.out.println("A rectangle "+ rectangle.toString());
        System.out.println("The area is "+ rectangle.getArea());
        System.out.println("The perimeter is "+ rectangle.getPerimeter());
    }
}
