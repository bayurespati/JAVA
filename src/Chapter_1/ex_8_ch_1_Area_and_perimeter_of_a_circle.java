package Chapter_1;

/**
 * Created by DWP on 9/5/16.
 (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 perimeter = 2 * radius * p area = radius * radius * p
 */
public class ex_8_ch_1_Area_and_perimeter_of_a_circle {
    public static void main(String[] args) {
        double radius = 5.5;
        System.out.println("radius= 5.5");
        System.out.print("perimeter = " + (2*radius*Math.PI + "\n"));
        System.out.println("Area = " + (radius*radius*Math.PI));
    }
}
