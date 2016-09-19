package Chapter_4;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 */
public class ex_21_ch_4_check_SSn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN : ");
        String ssn = input.next();
        boolean ssnValid= (Character.isDigit(ssn.charAt(0))) &&
                            (Character.isDigit(ssn.charAt(1))) &&
                            (Character.isDigit(ssn.charAt(2))) &&
                            (Character.isDigit(ssn.charAt(4))) &&
                            (Character.isDigit(ssn.charAt(5))) &&
                            (Character.isDigit(ssn.charAt(7))) &&
                            (Character.isDigit(ssn.charAt(8))) &&
                            (Character.isDigit(ssn.charAt(9))) &&
                            (Character.isDigit(ssn.charAt(10))) &&
                            ssn.length() == 11;

        if(ssnValid){
            if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-')
            System.out.println(ssn+" is a Valid social security number");
        }
        else
            System.out.println(ssn+" is an invalid social security number");
    }
}
