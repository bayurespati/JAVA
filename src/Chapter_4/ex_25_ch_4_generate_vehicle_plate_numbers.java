package Chapter_4;



/**
 * Created by DWP on 9/20/16.
 */
public class ex_25_ch_4_generate_vehicle_plate_numbers {
    public static void main(String[] args) {

        int firstLetter = (int) (65+(Math.random()*26));
        int secondLetter = (int) (65+(Math.random()*26));
        int thirdLetter = (int) (65+(Math.random()*26));
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*1000);




        System.out.print(""+(char)firstLetter+(char)secondLetter+(char)thirdLetter+" ");
        System.out.println(number1+""+number2);


    }
}
