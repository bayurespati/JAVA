package Chapter_9.libaray_class_chapter_9;

/**
 * Created by bnamora on 2/10/17.
 */
public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public Rectangle(){
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (width * 2) + (length * 2);
    }
}
