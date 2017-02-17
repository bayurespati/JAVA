package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/13/17.
 */
public class Course {
    private String courseName;
    private String[] student = new String[100];
    private int numberOfStudent;


    public Course(){
    }

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(numberOfStudent >= student.length()){
            String[] temp = new String[this.student.length * 2];
            System.arraycopy(this.student,0,temp,0,this.student.length);
            this.student = temp;
        }
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
        for(int i = 0; i < numberOfStudent; i++){
            if(this.student[i].equalsIgnoreCase(student)){
                deleteStudent(i);
                numberOfStudent--;
            }
        }
    }

    private void deleteStudent(int i){
        for(int index = i; index < numberOfStudent - 1; index++){
            student[index] = student[index + 1];
        }
    }

    public void clear(){
        while (numberOfStudent > 0){
            student[numberOfStudent--] = "";
        }
    }
}
