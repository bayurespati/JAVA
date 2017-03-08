package Chapter_12;

/**
 * Created by bnamora on 3/8/17.
 */
public class ex_10_ch_12_outOfMemoryError {
    private static final int SIZE = 1000 * 1024 * 1024;
    public static void main(String[] args) {
        try{
            int[][] number = new int[SIZE][SIZE];
        }
        catch (OutOfMemoryError ex){
            System.out.println("Out of memory");
        }
    }
}
