package Chapter_10;

import Chapter_10.library_class_chapter_10.Course;

/**
 * Created by bnamora on 2/13/17.
 */
public class eg_5_ch_10_test_course {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Database System");

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
