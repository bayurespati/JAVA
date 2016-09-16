package Chapter_4;

/**
 * Created by DWP on 9/14/16.
 */
public class ex_6_ch_4_random_point_on_a_circle {
    public static void main(String[] args) {

        int a = (int) (Math.random()*360)+1;
        int b = (int) (Math.random()*360)+1;
        int c = (int) (Math.random()*360)+1;
        int r = 40;
        double p0x = r * Math.cos(a);
        double p0y = r * Math.sin(a);
        double p1x = r * Math.cos(b);
        double p1y = r * Math.sin(b);
        double p2x = r * Math.cos(c);
        double p2y = r * Math.sin(c);


        System.out.println("P0 x and y : "+p0x+" "+p0y);
        System.out.println("P1 x and y : "+p1x+" "+p1y);
        System.out.println("P2 x and y : "+p2x+" "+p2y);

    }
}
