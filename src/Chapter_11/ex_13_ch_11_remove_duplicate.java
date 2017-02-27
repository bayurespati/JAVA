package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_13_ch_11_remove_duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        removeDuplicate(list);
        System.out.print("The distinct integers is : ");
        for (Integer lists: list)
            System.out.print(lists+" ");

    }

    public static ArrayList<Integer> getList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 number : ");
        for(int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }
        return list;
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            for(int k = i + 1; k < list.size(); k++){
                if(list.get(i) == list.get(k)){
                    list.remove(k);
                }
            }
        }
    }
}
