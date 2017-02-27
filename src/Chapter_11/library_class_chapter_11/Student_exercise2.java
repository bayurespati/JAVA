package Chapter_11.library_class_chapter_11;

/**
 * Created by bnamora on 2/27/17.
 */
public class Student_exercise2 extends Person_exercise2 {
    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;


    public Student_exercise2(){
    }

    public Student_exercise2(String name, String address, String phoneNumber, String email){
        super(name,address,phoneNumber,email);
    }

    @Override
    public String toString(){
        return "name is "+getName()+" class Student exercise";
    }
}
