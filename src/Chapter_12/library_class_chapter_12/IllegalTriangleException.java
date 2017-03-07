package Chapter_12.library_class_chapter_12;

/**
 * Created by bnamora on 3/7/17.
 */
public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(double s1, double s2, double s3){
        super("Triangle violate the rule sum of any two side must be grater than the other side ");
    }
}
