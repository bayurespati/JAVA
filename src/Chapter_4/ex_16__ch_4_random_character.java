package Chapter_4;

/**
 * Created by DWP on 9/19/16.
 *
 */
public class ex_16__ch_4_random_character {
    public static void main(String[] args) {

        int character = (int) (65 + Math.random()* 26);
        System.out.println(" "+(char)character);
    }
}
