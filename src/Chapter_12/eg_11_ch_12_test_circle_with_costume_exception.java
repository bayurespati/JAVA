package Chapter_12;

import Chapter_12.library_class_chapter_12.CircleWithCustomException;
import Chapter_12.library_class_chapter_12.InvalidRadiusException;

/**
 * Created by bnamora on 3/6/17.
 */
public class eg_11_ch_12_test_circle_with_costume_exception {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex){
            System.out.println(ex);
        }

        System.out.println("Number of objects created: "+CircleWithCustomException.getNumberOfObject());
    }
}
