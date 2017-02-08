package Chapter_9;

/**
 * Created by bnamora on 2/8/17.
 */
public class eg_8_ch_9_circle_with_private_data_fields {
    private double radius;

    private static int numberOfProjects = 0;

    public eg_8_ch_9_circle_with_private_data_fields(){
        numberOfProjects++;
    }

    public eg_8_ch_9_circle_with_private_data_fields(double newRadius){
        radius =  newRadius;
        numberOfProjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0 ;
    }

    public static int getNumberOfProjects(){
        return numberOfProjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
