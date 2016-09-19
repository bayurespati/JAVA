package Chapter_4;



import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by DWP on 9/20/16.
 */
public class ex_24_eg_4_order_three_citites {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city : ");
        String firstCity = input.nextLine();

        System.out.print("Enter the Second city : ");
        String secondCity = input.nextLine();

        System.out.print("Enter the third city : ");
        String thirdCity = input.nextLine();


        System.out.print("The three cities in alphabetic order are ");

        if(firstCity.compareTo(secondCity) < 0){
            if(secondCity.compareTo(thirdCity) < 0){
                System.out.println(firstCity+" "+secondCity+" "+thirdCity);
            }
            else if(thirdCity.compareTo(firstCity)<0){
                System.out.println(thirdCity+" "+firstCity+" "+secondCity);
            }
            else
                System.out.println(firstCity+" "+thirdCity+" "+secondCity);
        }
        else{
            if(secondCity.compareTo(firstCity) <0){
                System.out.println(secondCity+" "+firstCity+" "+thirdCity);
            }
            else if(thirdCity.compareTo(firstCity)<0){
                System.out.println(thirdCity+" "+secondCity+" "+firstCity);
            }
            else
                System.out.println(secondCity+" "+thirdCity+" "+firstCity);
        }

    }
}
