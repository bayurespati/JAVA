package Chapter_11.library_class_chapter_11;

/**
 * Created by bnamora on 2/27/17.
 */
public class Staff_exercise2 extends Employee_exercise2 {
    private String tittle;

    public Staff_exercise2(){
    }

    public Staff_exercise2(String name,String tittle){
        setName(name);
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "name is "+getName()+" class Staff_exercise2";
    }
}
