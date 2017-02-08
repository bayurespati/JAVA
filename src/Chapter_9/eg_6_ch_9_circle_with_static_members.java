package Chapter_9;

/**
 * Created by bnamora on 2/8/17.
 */
public class eg_6_ch_9_circle_with_static_members {
    double radius;

    static int numberOfprojects = 0;

    eg_6_ch_9_circle_with_static_members(){
        radius = 1;
        numberOfprojects++;
    }

    eg_6_ch_9_circle_with_static_members(double newRadius){
        radius = newRadius;
        numberOfprojects++;
    }

    static int getNumberOfprojects(){
        return numberOfprojects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}
