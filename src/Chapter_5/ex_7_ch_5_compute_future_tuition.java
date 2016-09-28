package Chapter_5;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_7_ch_5_compute_future_tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        for(int y=1; y<11; y++){
            tuition *= 1.05;
                if(y==5){
                    System.out.println("Total cost of four year : "+tuition);
                }
        }
        System.out.printf("Tuition in ten years be : %.2f", tuition);
    }
}
