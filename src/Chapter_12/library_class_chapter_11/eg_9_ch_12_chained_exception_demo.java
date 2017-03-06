package Chapter_12.library_class_chapter_11;

/**
 * Created by bnamora on 3/4/17.
 */
public class eg_9_ch_12_chained_exception_demo {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try{
            method2();
        }
        catch (Exception ex){
            throw new Exception("New info from methods1");
        }
    }

    public static void method2() throws  Exception{
        throw new Exception("New info From methods");
    }
}
