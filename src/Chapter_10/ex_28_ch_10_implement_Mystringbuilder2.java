package Chapter_10;

import Chapter_10.library_class_chapter_10.MyStringBuilder2;

/**
 * Created by bnamora on 2/22/17.
 */
public class ex_28_ch_10_implement_Mystringbuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 string = new MyStringBuilder2("dsfdsfdsf");
        string.insert(4,new MyStringBuilder2("INIHURUFGEDESEMUA"));
        string.reverse();
        string.toUpperCase();
        string.substring(3);
    }
}
