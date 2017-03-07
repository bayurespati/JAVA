package Chapter_12;

/**
 * Created by bnamora on 3/7/17.
 */
public class ex_1_ch_12_NumberOfException {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java calculator operand1 operator operand2");
            System.exit(0);
        }

        try{
            Integer.parseInt(args[0]);
            Integer.parseInt(args[2]);

            int result = 0;
            switch (args[1].charAt(0)){
                case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            }

            System.out.println(args[0]+' '+args[1]+' '+args[2]+" = "+result);
        }
        catch (Exception ex){
            System.out.println("Wrong input "+ex.getMessage());
        }
    }
}
