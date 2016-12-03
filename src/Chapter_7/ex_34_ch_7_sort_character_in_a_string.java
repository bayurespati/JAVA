package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/3/16.
 */
public class ex_34_ch_7_sort_character_in_a_string {
    public static void main(String[] args) {
        String alphabet = getString();
        printSorted(getSort(alphabet));
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter alphabet : ");
        return input.nextLine();
    }

    public static String getSort(String alphabet){
        String sort = "";
        int[] changeAlphabet =  getChange(alphabet);
        ex_31_ch_7_merge_two_sorted_list.sortedList(changeAlphabet);

        for(int i = 0; i < changeAlphabet.length; i++){
            sort +=(char) changeAlphabet[i];
        }
        return sort;
    }

    public static int[] getChange(String alphabet){
        int[] changeAlphabet = new int[alphabet.length()];
        for(int i = 0; i < changeAlphabet.length; i++){
            changeAlphabet[i] = alphabet.charAt(i);
        }
        return changeAlphabet;
    }

    public static void printSorted(String alphabet){
        System.out.print("Sorted is : "+alphabet);
    }

}
