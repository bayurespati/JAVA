package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_11_ch_11_sort_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        sort(list);
        printList(list);
    }

    public static ArrayList<Integer> getList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter Five 5 number : ");
        for(int i = 0; i < 5; i++){
            list.add(input.nextInt());
        }
        return list;
    }

    public static void sort(ArrayList<Integer> list){
        java.util.Collections.sort(list);
    }

    public static void printList(ArrayList<Integer> list){
        System.out.print("Sort list by  increasing order : ");
        for (Integer lists:list)
            System.out.print(lists+" ");
    }
}
