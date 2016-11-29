package Chapter_7;


import java.util.Scanner;

/**
 * Created by DWP on 11/28/16.
 */
public class ex_21_ch_7_game_bean_machine {
    public static void main(String[] args) {
        int balls = getBalls();
        int slotLength = getSlotLength();
        int[] slotMachine = new int [slotLength];

        printPath(balls,slotMachine);
    }

    public static int getBalls(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number of balls to drop : ");
        return input.nextInt();
    }

    public static int getSlotLength(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of slot in the bean machine : ");
        return input.nextInt();
    }

    public static void printPath(int balls,int[] slotMachine){

        for(int i = 0; i < balls; i++){
            int countR = 0;
            int k = 1;

            while(k < slotMachine.length){
                int ball = (int) (Math.random()*2);
                if(ball == 1){
                    countR ++;
                    System.out.printf("R");
                }
                else
                    System.out.print("L");
                k++;
            }
            slotMachine[countR]++;
            System.out.println();
        }

       printFinalPath(slotMachine);
    }

    public static void printFinalPath(int[] slotMachine){
        System.out.println("------------>>><<<<-----------");

        int max = getMax(slotMachine);

        while (max > 0) {

            for (int i = 0; i < slotMachine.length; i++) {
                if (slotMachine[i] == max) {
                    System.out.print(" o ");
                    slotMachine[i]--;
                } else
                    System.out.print("   ");
            }
            max--;
            System.out.println();

        }

        for(int i = 1; i <= slotMachine.length; i++){
            System.out.print("#"+i+" ");
        }
    }

    public static int getMax(int[] slotMachine){
        int max = slotMachine[0];
        for(int i = 1; i < slotMachine.length - 1; i++){
            if(max < slotMachine[i]){
                max = slotMachine[i];
            }
        }
        return max;
    }
}
