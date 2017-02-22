package Chapter_10;

import Chapter_10.library_class_chapter_10.MySplit;

/**
 * Created by bnamora on 2/21/17.
 */
public class ex_25_ch_10_new_string_split {
    public static void main(String[] args) {
        String test = "aa????b?gf#ee?ff";
        String regex = "[?#]";
        String[] test2 = MySplit.split(test,regex);

        for(int i = 0; i<test2.length; i++){
            System.out.print(test2[i]+" ");
        }

    }
}
//a?b?gf#e