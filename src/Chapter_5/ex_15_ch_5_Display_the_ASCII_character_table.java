package Chapter_5;

/**
 * Created by DWP on 9/30/16.
 */
public class ex_15_ch_5_Display_the_ASCII_character_table {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 33; i < 127; i++) {

            System.out.print(" "+(char)i);
                count++;
                if(count % 10 == 0){
                    System.out.println();
                }
          }
    }
}
