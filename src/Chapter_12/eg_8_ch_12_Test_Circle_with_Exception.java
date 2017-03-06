package Chapter_12;

import Chapter_12.library_class_chapter_12.CircleWithException;

/**
 * Created by bnamora on 3/3/17.
 */
public class eg_8_ch_12_Test_Circle_with_Exception {
    public static void main(String[] args) {
        try{
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }catch (IllegalArgumentException ex){
            System.out.println(ex);
        }

        System.out.println("Number of created "+CircleWithException.getNumberOfObject());
    }
}
