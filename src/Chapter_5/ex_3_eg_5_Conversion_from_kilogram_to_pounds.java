package Chapter_5;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_3_eg_5_Conversion_from_kilogram_to_pounds {
    public static void main(String[] args) {

        int kilo = 1;
        System.out.println("Kilograms      Pounds");
        while(kilo<200){
            double pounds = kilo * 2.2;
            System.out.printf(kilo+"               %.2f",pounds);
            System.out.println("");
            kilo++;
        }
    }
}
