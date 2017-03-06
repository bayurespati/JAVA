package Chapter_12.library_class_chapter_12;

/**
 * Created by bnamora on 3/6/17.
 */
public class CircleWithCustomException {
    private double radius;

    public static int numberOfObject = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObject++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if(newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObject(){
        return numberOfObject;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }
}
