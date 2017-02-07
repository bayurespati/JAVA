package Chapter_9;

/**
 * Created by bnamora on 2/7/17.
 */
public class eg_2_ch_9_simple_circle {
    public static void main(String[] args) {
        eg_2_ch_9_simple_circle circle1 = new eg_2_ch_9_simple_circle();
        System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());

        eg_2_ch_9_simple_circle circle2 = new eg_2_ch_9_simple_circle(25);
        System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());

        eg_2_ch_9_simple_circle circle3 = new eg_2_ch_9_simple_circle(125);
        System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
    }

    double radius;

    eg_2_ch_9_simple_circle(){
        radius = 1;
    }

    eg_2_ch_9_simple_circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
