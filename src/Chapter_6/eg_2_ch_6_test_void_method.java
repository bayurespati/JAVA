package Chapter_6;

/**
 * Created by DWP on 10/14/16.
 */
public class eg_2_ch_6_test_void_method {
    public static void main(String[] args) {
        System.out.printf("The grade is ");
        printGrade(78.5);

        System.out.printf("The grade is ");
        printGrade(59.9);
    }
    public static void printGrade(double score){
        if(score >= 90.0){
            System.out.println('A');
        }
        else if(score >= 80.0){
            System.out.println('B');
        }
        else if(score >= 70.0){
            System.out.println('C');
        }
        else if(score >= 60.0){
            System.out.println('D');
        }
        else{
            System.out.println('F');
        }
    }
}
