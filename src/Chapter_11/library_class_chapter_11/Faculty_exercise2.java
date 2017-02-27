package Chapter_11.library_class_chapter_11;

/**
 * Created by bnamora on 2/27/17.
 */
public class Faculty_exercise2 extends Employee_exercise2 {
    private int officeHour;
    private String rank;

    public Faculty_exercise2(){
    }

    public Faculty_exercise2(String name, String rank, int officeHour){
        setName(name);
        this.rank = rank;
        this.officeHour = officeHour;
    }

    @Override
    public String toString(){
        return "name is "+getName()+" class Faculty_exercise2";
    }
}
