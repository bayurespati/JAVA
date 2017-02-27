package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_12_ch_11_sum_arrayList {
    public static void main(String[] args) {
        ArrayList<Double> list = getList();
        System.out.println("Sum of list : "+sum(list));

    }
    public static ArrayList<Double> getList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.print("Enter Five 5 number : ");
        for(int i = 0; i < 5; i++){
            list.add(input.nextDouble());
        }
        return list;
    }
    public static double sum (ArrayList<Double> list){
        double sum = 0;
        for (Double lists: list)
            sum += lists;
        return sum;
    }
}
