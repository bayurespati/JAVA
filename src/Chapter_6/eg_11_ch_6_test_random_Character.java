package Chapter_6;

/**
 * Created by DWP on 10/24/16.
 */
public class eg_11_ch_6_test_random_Character {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        for(int i = 0; i < NUMBER_OF_CHARS; i++){
            char ch = eg_10_ch_6_random_character.getRandomLowerCaseLetter();

            if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
