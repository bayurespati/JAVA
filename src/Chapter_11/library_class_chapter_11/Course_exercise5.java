package Chapter_11.library_class_chapter_11;

import java.util.ArrayList;

/**
 * Created by bnamora on 2/27/17.
 */
public class Course_exercise5 {
    private String courseName;
    private ArrayList<String> student = new ArrayList<>();

    public Course_exercise5(){
    }

    public Course_exercise5(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        this.student.add(student);
    }

    public String[] getStudent(){
        String[] student = new String[this.student.size()];
        for(int i = 0; i < student.length; i++){
            student[i] = this.student.get(i);
        }
        return student;
    }

    public int getNumberOfStudent(){
        return student.size();
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        this.student.remove(student);
    }

    private void deleteStudent(int i){
        student.remove(i);
    }

    public void clear(){
        student.clear();
    }
}
