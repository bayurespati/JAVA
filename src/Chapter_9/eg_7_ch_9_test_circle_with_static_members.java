package Chapter_9;

/**
 * Created by bnamora on 2/8/17.
 */
public class eg_7_ch_9_test_circle_with_static_members {
    public static void main(String[] args) {
        System.out.println("Before Creating Objects");
        System.out.println("The number of Circle Object is "+eg_6_ch_9_circle_with_static_members.numberOfprojects);

        eg_6_ch_9_circle_with_static_members c1 = new eg_6_ch_9_circle_with_static_members();

        System.out.println("\nAfter Creating c1");
        System.out.println("c1 : radius ("+c1.radius+") and number of circle objects ("+c1.numberOfprojects+")");

        eg_6_ch_9_circle_with_static_members c2 = new eg_6_ch_9_circle_with_static_members(5);

        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1 : radius ("+c1.radius+") and number of circle objects ("+c1.numberOfprojects+")");
        System.out.println("c2 : radius ("+c2.radius+") and number of circle objects ("+c2.numberOfprojects+")");
    }
}
