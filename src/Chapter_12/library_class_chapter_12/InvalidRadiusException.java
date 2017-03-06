package Chapter_12.library_class_chapter_12;

/**
 * Created by bnamora on 3/6/17.
 */
public class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException(double radius){
        super("Invalid radius "+ radius);
            this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
