package Chapter_7;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_9_ch_7_find_smallest_elment {
    public static void main(String[] args) {
        double[] number = ex_8_ch_7_average_an_array.getNumber();
        double smallNumber = getSmallNumber(number);

        System.out.println("The minimum number is : "+smallNumber);
    }

    public static double getSmallNumber(double[] number){
        double smallNumber = number[0];

        for(int i = 1; i < number.length-1; i++){
            if(smallNumber < number[i]){
                smallNumber = smallNumber;
            }
            else
                smallNumber = number[i];
        }

        return smallNumber;
    }
}
