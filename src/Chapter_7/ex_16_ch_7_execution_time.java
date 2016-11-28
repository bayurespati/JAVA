package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/28/16.
 */
public class ex_16_ch_7_execution_time {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] listNumber = getList();
        int key = getKet();

        linearSearch(listNumber,key);
        binarySearch(listNumber,key);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        print(executionTime,listNumber);
    }

    public static int[] getList(){
        int[] listNumber = new int[100000];

        for(int i = 0; i <listNumber.length; i++){
            listNumber[i] = i;
        }
        return listNumber;
    }

    public static int getKet(){
        Scanner input  = new Scanner(System.in);

        System.out.print("Input The key = : ");
        return input.nextInt();
    }

    public  static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return  -1;
    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;

            if(key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;

        }

        return -low -1;
    }

    public static void print(long executionTime,int[] listNumber){
        System.out.println("Time is : "+executionTime);

        /*for(int i =0; i<listNumber.length; i++){
            System.out.println(listNumber[i]);
        }*/
    }
}
