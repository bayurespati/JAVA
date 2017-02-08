package Chapter_9;

/**
 * Created by bnamora on 2/8/17.
 */
public class eg_10_ch_9_test_pass_object {
    public static void main(String[] args) {
        eg_8_ch_9_circle_with_private_data_fields myCirlce = new eg_8_ch_9_circle_with_private_data_fields(1);

        int n = 5;
        printAreas(myCirlce,n);
        System.out.println("\n"+"Radius is "+myCirlce.getRadius());
        System.out.println("n is "+n);
    }

    public static void printAreas(eg_8_ch_9_circle_with_private_data_fields w,int times){
        System.out.println("Radius \t\tArea");
        while(times >= 1){
            System.out.println(w.getRadius() + "\t\t\t"+w.getArea());
            w.setRadius(w.getRadius() + 1);
            times--;
        }
    }
}
