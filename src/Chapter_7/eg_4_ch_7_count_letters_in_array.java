package Chapter_7;

import Chapter_6.eg_10_ch_6_random_character;

/**
 * Created by DWP on 11/3/16.
 */
public class eg_4_ch_7_count_letters_in_array {
    public static void main(String[] args) {
        char[] chars = createArray();


        System.out.println("The lowercase Letter are");
        displayArray(chars);

        int[] counts = countLetter(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are :  ");

        displayCount(counts);
    }

    public static char[] createArray(){

        char[] chars = new char[100];

        for(int i = 0; i < chars.length; i++ )
            chars[i] = eg_10_ch_6_random_character.getRandomLowerCaseLetter();

            return chars;

    }

    public static void displayArray(char[] chars){

        for(int i = 0; i < chars.length; i++){
            if((i + 1 ) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i]+" ");
        }
    }

    public static int[] countLetter(char[] chars){
        int[] counts = new int[26];

        for(int i = 0; i <chars.length; i++ ){
            //cara buat dapetin index count anjing
            counts [chars[i] - 'a'] ++;
        }
        return counts;
    }

    public static void displayCount(int[] counts){
        for(int i = 0; i < counts.length; i++ ){
            if( (i + 1) % 10 == 0)
                System.out.println(counts[i]+" "+(char)(i+'a'));
            else
                System.out.print(counts[i]+" "+(char)(i+'a')+" ");
        }
    }
}
