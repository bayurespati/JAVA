package Chapter_10;

import Chapter_10.library_class_chapter_10.Course;

/**
 * Created by bnamora on 2/17/17.
 */
public class ex_9_ch_10_the_course_class {
    public static void main(String[] args) {

        Course course1 = new Course("Belajar Masak");
        course1.addStudent("Amir");
        course1.addStudent("Amur");
        course1.addStudent("Andre");
        course1.addStudent("Sumail");
        course1.addStudent("Tika");
        course1.addStudent("Rina");
        course1.addStudent("Susi");
        course1.addStudent("Bedul");

        course1.dropStudent("Rina");


        System.out.println("Number of student in course1 : "+course1.getNumberOfStudent());
        String[] students = course1.getStudent();
        for(int i = 0; i < course1.getNumberOfStudent(); i++){
            System.out.print(students[i]+", ");
        }
        course1.clear();
        System.out.println();
        System.out.println("Number of student in course1 : "+course1.getNumberOfStudent());
    }
}
