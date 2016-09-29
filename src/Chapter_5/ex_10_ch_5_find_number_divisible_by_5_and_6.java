package Chapter_5;

/**
 * Created by DWP on 9/29/16.
 */
public class ex_10_ch_5_find_number_divisible_by_5_and_6 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i < 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf(" ");
                System.out.print(i);
                count++;

                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
