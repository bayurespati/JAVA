package Chapter_11.test.library_class_chapter_10;

/**
 * Created by bnamora on 2/23/17.
 */
public class CircleFromSimpleGeometricObject
        extends SimpleGeometryObject{
    private double radius;

    public CircleFromSimpleGeometricObject(){
    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
    }
}
