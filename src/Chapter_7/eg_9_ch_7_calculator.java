package Chapter_7;

/**
 * Created by Sletszarr on 11/8/16.
 */
public class eg_9_ch_7_calculator {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java calculator operand1 operator operand2");
            System.exit(0);
        }

        //the result of the operation
        int result = 0;

        //Determine the operator
        switch (args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }

        //Display result
        System.out.println(args[0]+' '+args[1]+' '+args[2]+" = "+result);
    }
}
