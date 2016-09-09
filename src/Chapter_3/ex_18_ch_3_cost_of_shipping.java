package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.

 */
public class ex_18_ch_3_cost_of_shipping {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the weight of the package : ");
        int weightPackage = input.nextInt();

        if(weightPackage <= 1){
            System.out.print("Cost of shipping is : $3.5");
        }
        else if(weightPackage <= 3)
            System.out.print("Cost of shipping is : $5.5");
        else if(weightPackage <= 10)
            System.out.print("Cost of shipping is : $8.5");
        else if(weightPackage <= 20)
            System.out.print("Cost of shipping is : $10.5");
        else if (weightPackage > 50)
            System.out.print("The package cannot be shipped");

    }
}
