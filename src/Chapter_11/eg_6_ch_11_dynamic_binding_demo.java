package Chapter_11;

import Chapter_11.library_class_chapter_11.GraduateStudent;
import Chapter_11.library_class_chapter_11.Person;
import Chapter_11.library_class_chapter_11.Student;

/**
 * Created by bnamora on 2/24/17.
 */
public class eg_6_ch_11_dynamic_binding_demo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }
}

