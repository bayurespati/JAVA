package Chapter_11;

import Chapter_10.library_class_chapter_10.Loan;
import Chapter_11.library_class_chapter_11.CircleFromSimpleGeometricObject;
import sketch.Chapter_9_sketch.Circle;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_6_ch_11_use_array_list {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Date());
        list.add(new Loan());
        list.add("This is String");
        list.add(new  CircleFromSimpleGeometricObject(1.0));

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}
