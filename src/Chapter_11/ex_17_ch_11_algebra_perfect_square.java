package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Created by bnamora on 3/1/17.
 */
public class ex_17_ch_11_algebra_perfect_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m : ");
        int m = input.nextInt();

        ArrayList<Integer> list = getList(m);
        int n = getN(list);

        System.out.println("The smalls number n for m * n to be a perfect square is "+n);
        System.out.println("m * n : "+(m * n));
    }

    public static ArrayList<Integer> getList(int inputInteger){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; inputInteger > 1;){
            if(inputInteger %i == 0) {
                list.add(i);
                inputInteger /= i;
            }
            else
                i++;
        }
        return list;
    }

    public static int getN(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        int n = 1;
        for(int i = 0; i < list.size(); i++){
            int count = 0;
            for(int k = 0; k < list.size(); k++){
                if(list.get(i).equals(list.get(k))){
                    count++;
                }
            }
            if( count % 2 != 0 && !newList.contains(list.get(i)) ){
                newList.add(list.get(i));
                n *= list.get(i);
            }
        }
        return n;
    }
}
