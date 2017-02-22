package Chapter_10;

/**
 * Created by bnamora on 2/22/17.
 */
public class ex_26_ch_10_implement_calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            String[] tempString = getTempString(args);
            print(tempString);
        } else {
            print(args);
        }
    }

    public static int getOperator(String string){
        int temp = 0;
        for(int k = 0; k < string.length(); k++){
            if(!Character.isDigit(string.charAt(k))){
                temp = k;
                break;
            }
        }
        return temp;
    }

    public static String[] getTempString(String[] args){
        String[] tempString = new String[3];
        String temp = "";
        for (String string : args)
            temp += string;

        int indexOperator = getOperator(temp);
        String operator = "";
        operator +=(temp.charAt(indexOperator));

        String[] tempStr = temp.split("[+./-]");

        tempString[0] = tempStr[0];
        tempString[2] = tempStr[1];
        tempString[1] = operator;

        return tempString;
    }

    public static void print(String[] string){
        int result = 0;

        switch (string[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(string[0]) + Integer.parseInt(string[2]);
                break;
            case '-':
                result = Integer.parseInt(string[0]) - Integer.parseInt(string[2]);
                break;
            case '.':
                result = Integer.parseInt(string[0]) * Integer.parseInt(string[2]);
                break;
            case '/':
                result = Integer.parseInt(string[0]) / Integer.parseInt(string[2]);
        }

        System.out.println(string[0] + ' ' + string[1] + ' ' + string[2] + " = " + result);
    }
}