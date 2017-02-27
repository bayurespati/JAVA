package Chapter_11;

import Chapter_10.library_class_chapter_10.Course;
import Chapter_11.library_class_chapter_11.Course_exercise5;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_5_ch_11_the_course_class {
    public static void main(String[] args) {
        Course_exercise5 course1 = new Course_exercise5("Data Structure");
        Course_exercise5 course2 = new Course_exercise5("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of student in course1 : "+course1.getNumberOfStudent());
        String[] students = course1.getStudent();
        for(int i = 0; i < course1.getNumberOfStudent(); i++){
            System.out.print(students[i]+", ");
        }

        System.out.println();
        System.out.print("Number of student in course2 : "+course2.getNumberOfStudent());
    }
}
