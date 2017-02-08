package Chapter_9;

/**
 * Created by bnamora on 2/8/17.
 */
public class eg_9_ch_9_test_circle_with_private_data_fields {
    public static void main(String[] args) {
        eg_8_ch_9_circle_with_private_data_fields myCircle = new eg_8_ch_9_circle_with_private_data_fields();

        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());

        System.out.println("The number of object created is "+eg_8_ch_9_circle_with_private_data_fields.getNumberOfProjects());
    }
}
