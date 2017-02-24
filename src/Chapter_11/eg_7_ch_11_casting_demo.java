package Chapter_11;

import Chapter_11.library_class_chapter_11.CircleFromSimpleGeometricObject;
import Chapter_11.library_class_chapter_11.RectangleFromSimpleGeometricObject;

/**
 * Created by bnamora on 2/24/17.
 */
public class eg_7_ch_11_casting_demo {
    public static void main(String[] args) {
        Object object1 = new CircleFromSimpleGeometricObject(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1,1);

        displayObject(object1);
        displayObject(object2);
    }

    public static void displayObject(Object object){
        if(object instanceof  CircleFromSimpleGeometricObject){
            System.out.println("The circle area is : "+((CircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is : "+((CircleFromSimpleGeometricObject)object).getDiameter());
        }else if(object instanceof RectangleFromSimpleGeometricObject){
            System.out.println("The rectangle area is : "+((RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
