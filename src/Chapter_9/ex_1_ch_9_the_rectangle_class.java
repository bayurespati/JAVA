package Chapter_9;

/**
 * Created by bnamora on 2/9/17.
 */
public class ex_1_ch_9_the_rectangle_class {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("Rectangle1 have Width : "+rectangle1.getWidth()+" Length : "+rectangle1.getLength()+" Area : "+rectangle1.getArea()
                +" Perimeter : "+rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("Rectangle2 have Width : "+rectangle2.getWidth()+" Length : "+rectangle2.getLength()+" Area : "+rectangle2.getArea()
                +" Perimeter : "+rectangle2.getPerimeter());
    }
}

class Rectangle{
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double length;

    public Rectangle(){
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    double getArea(){
        return width * length;
    }

    double getPerimeter(){
        return (width * 2) + (length * 2);
    }


}
