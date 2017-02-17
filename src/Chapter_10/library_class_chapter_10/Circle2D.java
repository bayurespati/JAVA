package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/17/17.
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y){
        double distanceBetweenCenter = Math.pow(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2), 0.5);
        return distanceBetweenCenter <= this.radius;
    }

    public boolean contains(Circle2D circle){
        return getDistance(circle) <= (this.radius - circle.radius) || getDistance(circle) <= (circle.radius - this.radius);
    }

    public boolean overlap(Circle2D circle){
        return getDistance(circle) <= (this.radius + circle.radius);
    }

    private double getDistance(Circle2D circle){
        return Math.pow(Math.pow((this.x - circle.x), 2) + Math.pow((this.y - circle.y), 2), 0.5);
    }
}
