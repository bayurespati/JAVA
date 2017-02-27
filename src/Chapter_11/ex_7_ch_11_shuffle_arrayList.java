package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_7_ch_11_shuffle_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer (Input end with 0): ");
        int value;
        do{
            value = input.nextInt();
            if(value != 0)
                list.add(value);
        }while (value != 0);

        shuffle(list);
        System.out.println("After shuffle number  "+list);
    }

    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }
}
