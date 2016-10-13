package Chapter_5;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_40_ch_5_simulation_head_and_tail {
    public static void main(String[] args) {

        int head = 0;
        int tail = 0;
        for(int i = 0; i < 1000000; i++){

            int number = (int) (Math.random()*2);

            if(number == 0){
                head ++;
            }
            else
                tail ++;
        }

        System.out.println("Head = "+head+" tail = "+tail);
    }
}
