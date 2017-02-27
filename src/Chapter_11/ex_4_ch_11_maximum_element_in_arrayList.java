package Chapter_11;

import Chapter_11.library_class_chapter_11.SavingAccount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_4_ch_11_maximum_element_in_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer (Input end with 0): ");
        while (input.nextInt() != 0){
            list.add(input.nextInt());
        }
        System.out.println("Max number is "+max(list));
    }

    public static Integer max (ArrayList<Integer> list){
        return (list.size() == 0) ? null : java.util.Collections.max(list);
    }
}
