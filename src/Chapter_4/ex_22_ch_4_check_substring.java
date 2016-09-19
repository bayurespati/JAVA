package Chapter_4;



import java.util.Scanner;

/**
 * Created by DWP on 9/20/16.
 */
public class ex_22_ch_4_check_substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1 : ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2 : ");
        String s2 = input.nextLine();

        if(s2.contains(s1))
            System.out.print(s2+" Is a Substring of "+s1);
        else
            System.out.print(s2+" Is not a substring of "+s1);
    }
}
