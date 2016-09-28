package Chapter_5;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_6_ch_5_from_miles_to_kilometers {
    public static void main(String[] args) {

        System.out.printf("%s%15s","miles","kilometer");
        System.out.printf("\t|\t");
        System.out.printf("%s%15s","kilometers","miles\n");

        for(int m=1 ,k=20; m < 11 ; m++, k += 5){
            System.out.printf("%-5d %15.3f",m,(m*1.609));
            System.out.printf("\t|\t");
            System.out.printf("%-10d %14.3f",k,(k/1.609));
            System.out.println();
        }
    }
}
