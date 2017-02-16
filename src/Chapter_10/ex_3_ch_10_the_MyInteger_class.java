package Chapter_10;

import Chapter_10.library_class_chapter_10.MyInteger;

/**
 * Created by bnamora on 2/16/17.
 */
public class ex_3_ch_10_the_MyInteger_class {
    public static void main(String[] args) {
        MyInteger obj1 = new MyInteger();
        MyInteger obj2 = new MyInteger(30);
        MyInteger obj3 = new MyInteger(35);
        MyInteger obj4 = new MyInteger();

        System.out.println("is "+obj1.isTrue());
        System.out.println("is "+MyInteger.isTrue(obj2.getValue()));
        System.out.println("is "+MyInteger.isTrue(obj3));

        System.out.println(obj1.equals(obj4.getValue()));
    }
}
