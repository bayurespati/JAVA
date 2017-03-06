package Chapter_12.library_class_chapter_11;

/**
 * Created by bnamora on 3/6/17.
 */
public class invalidRadiusException extends Exception {
    private double radius;

    public invalidRadiusException(double radius){
            this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
