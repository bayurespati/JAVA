package Chapter_12;

import Chapter_12.library_class_chapter_12.IllegalTriangleException;
import Chapter_12.library_class_chapter_12.TriangleWithException;

/**
 * Created by bnamora on 3/7/17.
 */
public class ex_5_ch_12_TriangleWithException {
    public static void main(String[] args) {
        try {
            TriangleWithException triangle = new TriangleWithException(6,7,8);
            System.out.println("Area : "+triangle.getArea());
        }catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }
}