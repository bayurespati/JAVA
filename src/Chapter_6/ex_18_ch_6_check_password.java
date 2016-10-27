package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_18_ch_6_check_password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-password must have at least eight characters");
        System.out.println("-password consists of only letters and digits.");
        System.out.println("-password must contain at least two digits.");
        System.out.print("Enter Password : ");

        String password = input.nextLine();

        if (isValid(password)) {
            System.out.println("Password Anda valid");
        } else {
            System.out.println("Password Anda tidak valid");
        }

    }

    public static boolean isValid(String password){

//        if (password.length() < 8) {
//            return false;
//        }
//        else if(!isLetterOrNumber(password)){
//            return false;
//        }
//        else if (digitCountIsValid(password)) {
//            return false;
//        }
//
//        return true;

        return password.length() < 8 &&
                !isLetterOrNumber(password) &&
                digitCountIsValid(password);
    }

    public static boolean isLetterOrNumber(String password) {

        for(int i =0;i<password.length();i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean digitCountIsValid(String password) {
        int digitCounter = 0;

        for(int i =0;i<password.length();i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCounter++;
            }
        }

//        if (digitCounter >= 2) {
//            return true;
//        }
//
//        return false;
        return digitCounter >= 2;
    }


//    public static void checkPassword(String password) {
//        if (password.length() < 8) {
//            System.out.println("Your password Invalid ");
//        }
//        else {
//            cekLetterAndNumber(password);
//        }
//    }
//
//    public static void cekLetterAndNumber (String password){
//        int countNumber = 0;
//        int countWrong = 0;
//
//        for (int i = 0; i < password.length(); i++) {
//            if (! Character.isDigit(password.charAt(i)) && ! Character.isLetter(password.charAt(i))) {
//                countWrong++;
//            }
//            if (Character.isDigit(password.charAt(i))){
//                countNumber++;
//            }
//        }
//        if(countNumber < 2 || countWrong > 0){
//            System.out.println("Your password is Invalid");
//        }
//        else
//            System.out.println("Your password is Valid");
//    }

}
