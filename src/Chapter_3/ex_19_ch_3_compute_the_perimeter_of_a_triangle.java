package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.
 *
 */
public class ex_19_ch_3_compute_the_perimeter_of_a_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three edges of a triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        int perimeter = (side1 + side2 + side3);

        boolean valid = (side1 < side2 && side2 < side3 && side1+side2 > side3) ||
                        (side2 < side3 && side3 < side1 && side2+side3 > side1) ||
                        (side3 < side1 && side1 < side2 && side1+side3 > side2) ||
                        (side1 == side2 && side2 == side3);

        if(valid) System.out.print("The perimeter is : "+perimeter);
        else System.out.println("invalid");

    }
}
