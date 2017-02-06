package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/6/17.
 */
public class ex_36_ch_8_latin_Square {
    public static void main(String[] args) {
        char[] latinLetter = getLatinLetter();
        int length = getLength();
        char[][] inputLatin = getInputLatin(length);


        if(!isValidByCol(latinLetter,length,inputLatin)){
            System.out.println("Wrong Input by Col : the Letter must be from "+latinLetter[0]+" to "+latinLetter[length - 1]);
        }else if(!isValidByRow(latinLetter,length,inputLatin)){
            System.out.println("Wrong Input by Row : the Letter must be from "+latinLetter[0]+" to "+latinLetter[length - 1]);
        }else {
            System.out.println("The input array is Latin Square");
        }

    }

    public static char[] getLatinLetter(){
        char[] latinLetter = new char[26];
        char letter = 'A';
        for(int i = 0; i < latinLetter.length; i++){
            latinLetter[i] = letter;
            letter++;
        }
        return latinLetter;
    }

    public static int getLength(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n Number : ");
        return input.nextInt();
    }

    public static char[][] getInputLatin(int length){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter "+length+" row of letter separated by space : ");

        String[] tempInputLatin = new String[length * length];
        char[][] inputLatin = new char[length][length];

        for(int i = 0; i < tempInputLatin.length; i++){
            tempInputLatin[i] = input.next();
        }

        //Change input from string to char
        int indexForInput = 0;
        for(int row = 0; row < inputLatin.length; row++){
            for(int col = 0; col < inputLatin[0].length; col++){
                inputLatin[row][col] = tempInputLatin[indexForInput].charAt(0);
                indexForInput++;
            }
        }
        return inputLatin;
    }

    public static boolean isValidByCol(char[] latinLetter,int length,char[][] inputLatinLetter){
        for(int row = 0 ; row < inputLatinLetter.length; row++) {
            for(int indexForLatinLetter = 0; indexForLatinLetter < length; indexForLatinLetter++){
                int count = 0;
                for(int col = 0; col < inputLatinLetter.length; col++){
                    if(latinLetter[indexForLatinLetter] == inputLatinLetter[row][col]){
                        count++;
                    }
                }
                if(count == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidByRow(char[] latinLetter,int length,char[][] inputLatinLetter){
        for(int col = 0; col < inputLatinLetter.length; col++) {
            for (int indexForLatinLetter = 0; indexForLatinLetter < length; indexForLatinLetter++) {
                int count = 0;
                for (int row = 0; row < inputLatinLetter.length; row++) {
                    if (latinLetter[indexForLatinLetter] == inputLatinLetter[row][col]) {
                        count++;
                    }
                }
                if (count == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}