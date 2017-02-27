package Chapter_11;

import Chapter_11.library_class_chapter_11.*;
import sketch.Chapter_11_skecth.Faculty;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_2_ch_11_Design_Super_class_and_subclass {
    public static void main(String[] args) {
        Person_exercise2 person = new Person_exercise2("Abi","Kemangisan","0831247891","abi.giran@gmail.com");
        System.out.println(person.toString());
        Student_exercise2 student = new Student_exercise2("Kaesang","Istana","0831247891","kaesng.gils@gmail.com");
        System.out.println(student.toString());
        Employee_exercise2 employee = new Employee_exercise2("Ibnu","Gang Keluarga","0831247891","ibnu.labil@gmail.com",1234);
        System.out.println(employee.toString());
        Staff_exercise2 staff = new Staff_exercise2("Jono","Kopral");
        System.out.println(staff.toString());
        Faculty_exercise2 faculty = new Faculty_exercise2("Ninja","Kopral",7);
        System.out.println(faculty.toString());
    }
}
