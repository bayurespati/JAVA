package Chapter_11.library_class_chapter_11;

import Chapter_10.library_class_chapter_10.MyDate;

/**
 * Created by bnamora on 2/27/17.
 */
public class Employee_exercise2 extends Person_exercise2 {
    private double salary;
    private MyDate dateHired = new MyDate();

    public Employee_exercise2(){
        dateHired = new MyDate();
    }

    public Employee_exercise2(String name, String address, String phoneNumber, String email, double salary){
        super(name,address,phoneNumber,email);
        this.salary =  salary;
        dateHired = new MyDate();
    }

    @Override
    public String toString(){
        return "name is "+getName()+" class Employee_exercise2";
    }
}
