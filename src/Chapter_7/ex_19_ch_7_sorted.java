package Chapter_7;


import java.util.Scanner;

/**
 * Created by DWP on 11/28/16.
 */
public class ex_19_ch_7_sorted {
    public static void main(String[] args) {
        int lengthOfNumber = getLength();
        int[] number = getNumber(lengthOfNumber);

        print(number);
    }

    public static int getLength(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input total number : ");
        return input.nextInt();
    }

    public static int[] getNumber(int lenghtOfNumber){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number list : ");
        int[] number = new int[lenghtOfNumber];
        for(int i = 0; i < number.length; i++ ){
            number[i] = input.nextInt();
        }
        return number;
    }

    public static void print(int[] number){
        if(isSorted(number)){
            System.out.println("Already Sorted");
        }
        else
            System.out.println("Not Sorted");
    }

    public static boolean isSorted(int[] list){

        for(int i = 0; i < list.length; i++){
            if(list[i] > list[i+1]){
                return false;
            }
        }

        return true;
    }
}
