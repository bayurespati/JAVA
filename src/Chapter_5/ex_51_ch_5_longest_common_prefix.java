package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_51_ch_5_longest_common_prefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first String : ");
        String firstString = input.nextLine();
        System.out.print("Enter second String : ");
        String secondString = input.nextLine();

        if(firstString.charAt(0) != secondString.charAt(0)){
            System.out.println(firstString+" and "+secondString+" have no common prefix");
        }
        else {
            String commonPrefix = "";
            for (int i = 0; i < firstString.length(); i++) {

                if (firstString.charAt(i) == secondString.charAt(i)) {
                    commonPrefix += firstString.charAt(i);
                }
                else
                    break;
            }
            System.out.println("The common prefix is " + commonPrefix);
        }
    }
}
