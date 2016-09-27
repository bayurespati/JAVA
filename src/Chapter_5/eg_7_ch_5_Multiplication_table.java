package Chapter_5;



/**
 * Created by DWP on 9/27/16.
 */
public class eg_7_ch_5_Multiplication_table {
    public static void main(String[] args) {
        System.out.println(" Multiplication Table");

        System.out.print("    ");
        for(int j =1; j<=9; j++)
            System.out.print("   "+j);
        System.out.println("\n----------------------------------------");

        for(int i = 1; i<=9; i++){
            System.out.print(i+ " | ");
            for(int j = 1; j<=9; j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
