package Chapter_11;

import Chapter_11.library_class_chapter_11.CircleFromSimpleGeometricObject;
import Chapter_11.library_class_chapter_11.RectangleFromSimpleGeometricObject;
import Chapter_11.library_class_chapter_11.SimpleGeometryObject;

/**
 * Created by bnamora on 2/24/17.
 */
public class eg_5_ch_11_PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
        displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
    }

    public static void displayObject(SimpleGeometryObject object){
        System.out.println("Created on "+ object.getDateCreated()+" color is "+ object.getColor());
    }
}
