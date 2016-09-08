package Chapter_3;

/**
 * Created by DWP on 9/8/16.


 */
public class ex_4_ch_3_random_month {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 12 ) + 1;


        switch (number1){
            case 1 : System.out.print("january"); break;
            case 2 : System.out.print("february"); break;
            case 3 : System.out.print("march"); break;
            case 4 : System.out.print("april"); break;
            case 5 : System.out.print("may"); break;
            case 6 : System.out.print("june"); break;
            case 7 : System.out.print("july"); break;
            case 8 : System.out.print("august"); break;
            case 9 : System.out.print("september"); break;
            case 10 : System.out.print("october"); break;
            case 11 : System.out.print("november"); break;
            case 12 : System.out.print("december");
        }
    }
}
