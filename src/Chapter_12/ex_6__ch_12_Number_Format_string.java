package Chapter_12;


import java.util.Scanner;

/**
 * Created by bnamora on 3/7/17.
 */
public class ex_6__ch_12_Number_Format_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter hex number : ");
            String hexNumber = input.nextLine().toUpperCase();
            try{
                isValid(hexNumber);
                System.out.println("The decimal value for hex number "+hexNumber+" is "+hexToDecimal(hexNumber));
                break;
            }catch (NumberFormatException ex){
                System.out.println("\n"+ex.getMessage()+"\n");
            }
        }
    }

    public static boolean isValid(String hexNumber){
        for(int i = 0; i < hexNumber.length(); i++){
            if(!Character.isDigit(hexNumber.charAt(i)) && !isValidHex(hexNumber.charAt(i))){
                throw new NumberFormatException("Input must be hexNumber!!");
            }
        }
        return true;
    }

    public static boolean isValidHex(char a){
        String hexString = "ABCDEF";
        for(int i = 0; i < hexString.length(); i++){
            if(hexString.charAt(i) == a)
                return true;
        }
        return false;
    }

    public static int hexToDecimal(String hex) throws NumberFormatException {

        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if(ch >='A' && ch <='F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }

}