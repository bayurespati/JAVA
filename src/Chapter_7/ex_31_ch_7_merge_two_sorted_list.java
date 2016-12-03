package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/3/16.
 */
public class ex_31_ch_7_merge_two_sorted_list {
    public static void main(String[] args) {
        int length1 = getLength(1);
        int[] list1 = getList(length1,1);
        int length2 = getLength(2);
        int[] list2 = getList(length2,2);

        sortedList(list1);
        sortedList(list2);

        int[] mergeList = mergeList(list1,list2);
        sortedList(mergeList);

        printMergeList(mergeList);
    }

    public static int getLength(int number){
        Scanner input = new Scanner(System.in);

        System.out.print("Input how many number for list "+number+" : ");
        return input.nextInt();
    }

    public static int[] getList(int length,int number){
        Scanner input = new Scanner(System.in);

        int[] list = new int[length];
        System.out.print("Enter List"+number+" : ");
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        return list;
    }

    public static void sortedList(int[] list){
        for (int i = 0; i <list.length ; i++) {

            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static int[] mergeList(int[] list1,int[] list2){
        int[] merge = new int[list1.length + list2.length];

        int indexMerge = 0;
        for(int i = 0; i < list1.length; i++){
            merge[i] = list1[i];
            indexMerge++;
        }

        for(int i : list2){
            merge[indexMerge] = i;
            indexMerge++;
        }
        return merge;
    }

    public static void printMergeList(int[] mergeList){

        System.out.print("The merge List : ");
        for(int i : mergeList){
            System.out.print(i+" ");
        }
    }
}
