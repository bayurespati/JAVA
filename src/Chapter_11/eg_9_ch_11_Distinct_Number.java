package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/25/17.
 */
public class eg_9_ch_11_Distinct_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer (Input end with 0): ");
        int value;

        do{
            value = input.nextInt();
            if(!list.contains(value) && value != 0)
                list.add(value);
        }while (value != 0);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
