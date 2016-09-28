package Chapter_5;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_4_eg_5_convertion_from_miles_to_kilometers {
    public static void main(String[] args) {
        int miles = 1;
        System.out.println("Miles      Kilometer");
        while(miles<11){
            double kilometers = miles * 1.609;
            System.out.printf(miles+"            %.3f",kilometers);
            System.out.println("");
            miles++;
        }
    }
}
