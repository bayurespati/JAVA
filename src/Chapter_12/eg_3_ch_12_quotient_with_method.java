package Chapter_12;

import java.util.Scanner;

/**
 * Created by bnamora on 3/2/17.
 */
public class eg_3_ch_12_quotient_with_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int result = quotient(number1, number2);
        System.out.println(number1+" / "+" is "+result);
    }

    public static int quotient(int number1,int number2){
        if(number2 == 0){
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return number1 / number2;
    }
}
