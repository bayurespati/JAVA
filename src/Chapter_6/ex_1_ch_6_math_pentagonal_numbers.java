package Chapter_6;

/**
 * Created by DWP on 10/24/16.
 */
public class ex_1_ch_6_math_pentagonal_numbers {
    public static void main(String[] args) {
        printPentagonalNumber();
    }

    public static void printPentagonalNumber(){
        for(int i = 1; i <= 100; i++){
            System.out.print(" "+getPentagonalNumber(i));
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int i){
        i = (i * (3*i-1))/2;
        return i;
    }

}
