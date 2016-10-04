package Chapter_5;

/**
 * Created by DWP on 10/4/16.
 */
public class ex_27_ex_5_display_leap_years {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 101; i <=2100; i++){
            boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if (isLeapYear) {

                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
