package Chapter_6;

/**
 * Created by DWP on 11/2/16.
 */
public class ex_38_ch_6_generate_random_character {
    public static void main(String[] args) {

        final int CHARS_PER_LINE = 10;

        for(int i = 0; i < CHARS_PER_LINE; i++){

            for(int k = 1; k <= 10; k++){
                char ch = eg_10_ch_6_random_character.getRandomUpperCaseLetter();
                System.out.print(ch);
            }
            for(int k = 1; k <=10; k++){
                char digit = eg_10_ch_6_random_character.getRandomDigitCharacter();
                System.out.print(" "+digit);
                if(k % CHARS_PER_LINE == 0){
                    System.out.println();
                }
            }
        }
    }
}
