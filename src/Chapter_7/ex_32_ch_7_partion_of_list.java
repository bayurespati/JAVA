package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/3/16.
 */
public class ex_32_ch_7_partion_of_list {
    public static void main(String[] args) {
        int lengthNumber = getLengthNumber();
        int[] list = getList(lengthNumber);

        partitionList(list);

        printPartitionList(list);
    }

    public static int getLengthNumber(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input how many number : ");
        return input.nextInt();
    }

    public static int[] getList(int length){
        Scanner input = new Scanner(System.in);

        int[] list = new int[length];

        System.out.print("Enter List : ");

        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }

        return list;
    }

    public static void partitionList(int[] list){
        int numberLowerPivot = getNumberLower(list);
        int indexForMin = numberLowerPivot - 1;
        int indexForMax = 0;

        int[] listForMin = new int[numberLowerPivot];
        int[] listForMax = new int[list.length - (numberLowerPivot+1)];
        int pivot = list[0];


        for(int i = 1; i < list.length; i++){
            if(list[i] <= pivot){
                listForMin[indexForMin] = list[i];
                indexForMin--;
            }
            else if(list[i] > pivot) {
                listForMax[indexForMax] = list[i];
                indexForMax++;
            }
        }

        for(int i = 0; i < listForMin.length; i++){
            list[i] = listForMin[i];
        }

        for(int i = numberLowerPivot+1; i < list.length; i++){
            list[i] = listForMax[indexForMax-1];
            indexForMax--;
        }

        list[numberLowerPivot] = pivot;
    }

    public static int getNumberLower(int[] list){
        int numberLower = 0;

        int pivot = list[0];
        for(int i = 1; i < list.length; i++){
            if(list[i] <= pivot){
                numberLower++;
            }
        }
        return numberLower;
    }

    public static void printPartitionList(int[] list){
        System.out.print("After the partition, the list is ");
        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
