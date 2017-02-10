package Chapter_9.libaray_class_chapter_9;

/**
 * Created by bnamora on 2/10/17.
 */
public class SimpleCircle {
    public double radius;

    public SimpleCircle(){
        radius = 1;
    }

    public SimpleCircle(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }
}
