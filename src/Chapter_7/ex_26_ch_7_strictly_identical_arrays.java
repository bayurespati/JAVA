package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/2/16.
 */
public class ex_26_ch_7_strictly_identical_arrays {
    public static void main(String[] args) {
        int lengthNumber = getLengthNumber();
        int[] list1 = getList(lengthNumber,1);
        int[] list2 = getList(lengthNumber,2);

        printStatus(list1,list2);
    }

    public static int getLengthNumber(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input length number : ");
        return input.nextInt();
    }

    public static int[] getList(int length,int number){
        Scanner input = new Scanner(System.in);

        int[] list = new int[length];
        System.out.print("Input list"+number+" : ");
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        return list;
    }

    public static void printStatus(int[] list1, int[] list2){
        System.out.print("Two lists are ");
        System.out.print((equals(list1,list2)) ? "strictly identical" : "not strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2){
        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

}
