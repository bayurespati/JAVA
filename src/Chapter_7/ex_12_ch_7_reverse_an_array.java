package Chapter_7;

/**
 * Created by DWP on 11/25/16.
 */
public class ex_12_ch_7_reverse_an_array {
    public static void main(String[] args) {
        double[] number = ex_8_ch_7_average_an_array.getNumber();
        print(number);
    }

    public static double[] getReverseNumber(double[] number){

        double[] reverseNumber = new double [number.length];

        int index = number.length-1;

        for(int i = 0; i < number.length ; i++){
            reverseNumber[i] = number [index];
            index--;
        }
        return reverseNumber;
    }

    public static void print(double[] number){
        System.out.println("The number is : "+loopForPrint(getReverseNumber(number)));
    }

    public static String loopForPrint (double[] number){
        String print = "";

        for(int i = 0; i < number.length; i++){
            print += (" "+number[i]);
        }
        return print;
    }

}
