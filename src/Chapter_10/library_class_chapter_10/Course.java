package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/13/17.
 */
public class Course {
    private String courseName;
    private String[] student = new String[100];
    private int numberOfStudent;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        this.student[numberOfStudent] = student;
        numberOfStudent++;
    }

    public String[] getStudent(){
        return student;
    }

    public int getNumberOfStudent(){
        return numberOfStudent;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){

    }
}
