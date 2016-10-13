package Chapter_5;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_43_ch_5_math_combinations {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 1; i < 7; i++){
            for(int j = (i+1); j <= 7; j++){
                if(i != j){
                    System.out.println(i+""+j);
                    count ++;
                }
            }
        }

        System.out.println("The count is : "+count);
    }
}
