package Chapter_6;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_12_ch_6_display_characters {
    public static void main(String[] args) {
        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;

        printChars(ch1,ch2,numberPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){

        int count = 1;

        for(char i = ch1; i <= ch2; i++){

            System.out.print(i+" ");

            if(count % numberPerLine == 0){
                System.out.println();
            }

            count++;
        }
    }
}
