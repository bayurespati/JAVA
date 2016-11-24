package Chapter_7;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_7_ch_7_count_single_digit {
    public static void main(String[] args) {
        int[] digit = getDigit();
        int[] countDigit = getCountDigit(digit);

        printDigit(countDigit);
    }

    public static int[] getDigit(){
        int[] digit  = new int [100];

        for(int i = 0; i < digit.length; i++){
            digit[i] = (int) (Math.random() * 10);
        }
        return digit;
    }

    public static int[] getCountDigit(int[] digit){
        int[] countDigit = new int [10];

        for(int i = 0; i < digit.length; i++){
            countDigit [digit[i]] ++;
        }

        return countDigit;
    }

    public static void printDigit(int[] countDigit){
        for(int i = 0; i < countDigit.length; i++){
            System.out.println(i +" have "+countDigit[i]+" times random");
        }
    }

}
