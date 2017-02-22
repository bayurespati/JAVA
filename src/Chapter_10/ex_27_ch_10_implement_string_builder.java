package Chapter_10;

import Chapter_10.library_class_chapter_10.MyStringBuilder;

/**
 * Created by bnamora on 2/22/17.
 */
public class ex_27_ch_10_implement_string_builder {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("sssss");
        myStringBuilder.append(new MyStringBuilder("bBbGJKOL"));
        myStringBuilder.append(683984);
        myStringBuilder.toLowerCase();
        myStringBuilder.substring(2,10);
    }
}
